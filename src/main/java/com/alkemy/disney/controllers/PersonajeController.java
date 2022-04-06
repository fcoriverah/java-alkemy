package com.alkemy.disney.controllers;

import com.alkemy.disney.dtos.PersonajeDTO;
import com.alkemy.disney.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class PersonajeController {

    @Autowired
    private PersonajeRepository personajeRepository;

    @GetMapping("api/personajes")
    public List<PersonajeDTO> getPersonajes(){
        return personajeRepository.findAll().stream().map(PersonajeDTO::new).collect(toList());
    }
}
