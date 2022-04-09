package com.alkemy.disney.services;

import com.alkemy.disney.dtos.PersonajeDTO;
import com.alkemy.disney.models.Personaje;
import com.alkemy.disney.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class PersonajeService {

    @Autowired
    PersonajeRepository personajeRepository;

    public ResponseEntity<Object> crearPersonaje(String imagen, String nombre, Integer edad, Double peso, String historia) {

        if (imagen.isEmpty() || nombre.isEmpty() || edad == null || peso.isNaN()) {
            return new ResponseEntity<>("Datos incorrectos", HttpStatus.FORBIDDEN);
        }

        if (personajeRepository.findPersonajeByNombre(nombre) != null) {
            return new ResponseEntity<>("El personaje ya existe", HttpStatus.FORBIDDEN);
        }

        personajeRepository.save(new Personaje(imagen, nombre, edad, peso, historia));
        return new ResponseEntity<>("Personaje creado" ,HttpStatus.CREATED);
    }

    public ResponseEntity<Object> getPersonaje(Optional<String> name, Optional<String> sortBy){
        if (name.isPresent()) {
            return new ResponseEntity<>(personajeRepository.findPersonajeByNombre(name.get()), HttpStatus.OK);
        } else {
            try {
                return new ResponseEntity<>(personajeRepository.findAll(Sort.by(Sort.Direction.ASC, sortBy.orElse("id"))).stream().map(PersonajeDTO::new).collect(toList()), HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }
    }
}
