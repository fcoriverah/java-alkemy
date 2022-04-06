package com.alkemy.disney;

import com.alkemy.disney.models.*;
import com.alkemy.disney.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class DisneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisneyApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(
			PersonajeRepository personajeRepository,
			PeliculaSerieRepository peliculaSerieRepository,
			PersonajePeliculaSerieRepository personajePeliculaSerieRepository,
			GeneroRepository generoRepository,
			GeneroPeliculaSerieRepository generoPeliculaSerieRepository
	) {
		return (args) -> {
			//guardar cliente en el repositorio
			Personaje personaje1 = new Personaje("https://static.wikia.nocookie.net/sonic", "Sonic the hedgedog", 25, 70.3, "Aqui va la historia");
			personajeRepository.save(personaje1);

			Personaje personaje2 = new Personaje("https://static.wikia.nocookie.net/sonic", "Will Smith", 45, 80.3, "Aqui va la historia");
			personajeRepository.save(personaje2);

			PeliculaSerie peliculaSerie1 = new PeliculaSerie(personaje1, "https://static.wikia.nocookie.net/sonic-movie", "Sonic - La Pelicula", LocalDateTime.now(), 5);
			peliculaSerieRepository.save(peliculaSerie1);

			PeliculaSerie peliculaSerie2 = new PeliculaSerie(personaje1, "https://static.wikia.nocookie.net/rapido-furioso", "Rapido y furioso", LocalDateTime.now(), 5);
			peliculaSerieRepository.save(peliculaSerie2);

			PeliculaSerie peliculaSerie3 = new PeliculaSerie(personaje1, "https://static.wikia.nocookie.net/titanic", "Titanic", LocalDateTime.now(), 5);
			peliculaSerieRepository.save(peliculaSerie3);

			Genero genero1 = new Genero("Terror", "http://imagen.com/terror");
			generoRepository.save(genero1);

			GeneroPeliculaSerie generoPeliculaSerie1 = new GeneroPeliculaSerie(genero1, peliculaSerie1);
			generoPeliculaSerieRepository.save(generoPeliculaSerie1);

			personajePeliculaSerieRepository.save(new PersonajePeliculaSerie(personaje1, peliculaSerie1));
			personajePeliculaSerieRepository.save(new PersonajePeliculaSerie(personaje1, peliculaSerie2));
			personajePeliculaSerieRepository.save(new PersonajePeliculaSerie(personaje1, peliculaSerie3));
		};
	}
}
