package com.alkemy.disney.services;

import com.alkemy.disney.models.Genero;
import com.alkemy.disney.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static java.lang.String.valueOf;

@Service
public class GeneroService {

    @Autowired
    GeneroRepository generoRepository;

    public ResponseEntity<Object> crearGenero(String imagen, String nombre) {

        if (imagen.isEmpty() || nombre.isEmpty()) {
            return new ResponseEntity<>("Datos incorrectos", HttpStatus.FORBIDDEN);
        }

        Genero testing = generoRepository.findGeneroByNombre(valueOf(nombre));

        if (generoRepository.findGeneroByNombre(nombre) != null) {
            return new ResponseEntity<>("El genero ya existe", HttpStatus.FORBIDDEN);
        }

        generoRepository.save(new Genero(imagen, nombre));
        return new ResponseEntity<>("Genero creado" ,HttpStatus.OK);
    }
}
