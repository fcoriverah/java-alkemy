package com.alkemy.disney.controllers;

import com.alkemy.disney.repositories.PersonajeRepository;
import com.alkemy.disney.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    //obtener todos los personajes
    @GetMapping("api/personajes")
    public ResponseEntity<Object> getPersonajes(@RequestParam Optional<String> name, @RequestParam Optional<String> sortBy) {
        return personajeService.getPersonaje(name, sortBy);
    }

    //crear un personaje nuevo
    @PostMapping("api/personaje")
    public ResponseEntity<Object> createPersonaje(
            @RequestParam String imagen, @RequestParam String nombre,
            @RequestParam Integer edad, @RequestParam Double peso, @RequestParam String historia) {

        return personajeService.crearPersonaje(imagen, nombre, edad, peso, historia);
    }
}
