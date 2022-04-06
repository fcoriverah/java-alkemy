package com.alkemy.disney.services;

import com.alkemy.disney.models.Personaje;
import com.alkemy.disney.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {

    @Autowired
    PersonajeRepository personajeRepository;

    public ResponseEntity<Object> crearPersonaje(String imagen, String nombre, Integer edad, Double peso, String historia) {

        if (imagen.isEmpty() || nombre.isEmpty() || edad == null || peso.isNaN()) {
            return new ResponseEntity<>("Datos incorrectos", HttpStatus.FORBIDDEN);
        }

        if (personajeRepository.findByNombre(nombre) != null) {
            return new ResponseEntity<>("El personaje ya existe", HttpStatus.FORBIDDEN);
        }

        personajeRepository.save(new Personaje(imagen, nombre, edad, peso, historia));

        return new ResponseEntity<>("Personaje creado" ,HttpStatus.CREATED);

    }
}
