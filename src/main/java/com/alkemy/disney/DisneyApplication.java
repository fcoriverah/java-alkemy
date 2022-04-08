package com.alkemy.disney;

import com.alkemy.disney.models.*;
import com.alkemy.disney.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DisneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisneyApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(
			PersonajeRepository personajeRepository,
			PeliculaSerieRepository peliculaSerieRepository,
			GeneroRepository generoRepository
	) {
		return (args) -> {
			//guardar cliente en el repositorio
			Personaje personaje1 = new Personaje("https://static.wikia.nocookie.net/sonic", "Sonic the hedgedog", 25, 70.3, "Aqui va la historia");
			personajeRepository.save(personaje1);

			Personaje personaje2 = new Personaje("https://static.wikia.nocookie.net/sonic", "Will Smith", 45, 80.3, "Aqui va la historia");
			personajeRepository.save(personaje2);

			PeliculaSerie peliculaSerie1 = new PeliculaSerie("https://static.wikia.nocookie.net/sonic-movie", "Sonic - La Pelicula", LocalDateTime.now(), 5);
			peliculaSerieRepository.save(peliculaSerie1);

			PeliculaSerie peliculaSerie2 = new PeliculaSerie("https://static.wikia.nocookie.net/rapido-furioso", "Rapido y furioso", LocalDateTime.now(), 5);
			peliculaSerieRepository.save(peliculaSerie2);

			PeliculaSerie peliculaSerie3 = new PeliculaSerie("https://static.wikia.nocookie.net/titanic", "Titanic", LocalDateTime.now(), 5);
			peliculaSerieRepository.save(peliculaSerie3);

			PeliculaSerie peliculaSerie4 = new PeliculaSerie("https://static.wikia.nocookie.net/jackass", "Jackass", LocalDateTime.now(), 5);
			peliculaSerieRepository.save(peliculaSerie4);

			Genero genero1 = new Genero("Terror", "http://imagen.com/terror");
			generoRepository.save(genero1);

			//personaje1.setPeliculasSeries(Set.of(peliculaSerie1, peliculaSerie2, peliculaSerie3));

			// Add tag references in the post
			personaje1.getPeliculasSeries().add(peliculaSerie1);
			peliculaSerie1.getPersonajes().add(personaje1);
			personajeRepository.save(personaje1);


			genero1.getPeliculasSeries().add(peliculaSerie1);
			peliculaSerie1.getGeneros().add(genero1);
			generoRepository.save(genero1);
			peliculaSerieRepository.save(peliculaSerie1);





			personaje1.getPeliculasSeries().add(peliculaSerie2);
			peliculaSerie2.getPersonajes().add(personaje1);
			personajeRepository.save(personaje2);
			peliculaSerieRepository.save(peliculaSerie2);

			personaje2.getPeliculasSeries().add(peliculaSerie3);
			peliculaSerie3.getPersonajes().add(personaje2);
			personajeRepository.save(personaje2);
			peliculaSerieRepository.save(peliculaSerie3);
		};
	}
}
