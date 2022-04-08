package com.alkemy.disney.controllers;

import com.alkemy.disney.dtos.GeneroDTO;
import com.alkemy.disney.dtos.PeliculaSerieDTO;
import com.alkemy.disney.dtos.PersonajeDTO;
import com.alkemy.disney.models.Personaje;
import com.alkemy.disney.repositories.PersonajeRepository;
import com.alkemy.disney.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

@RestController
public class PersonajeController {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Autowired
    private PersonajeService personajeService;

    @GetMapping("api/personajes")
    public List<PersonajeDTO> getPersonajes(){
        return personajeRepository.findAll().stream().map(PersonajeDTO::new).collect(toList());
    }

    @PostMapping("api/personajes")
    public ResponseEntity<Object> register(
            @RequestParam String imagen, @RequestParam String nombre,
            @RequestParam Integer edad, @RequestParam Double peso, @RequestParam String historia) {

        return personajeService.crearPersonaje(imagen, nombre, edad, peso, historia);
    }
}
