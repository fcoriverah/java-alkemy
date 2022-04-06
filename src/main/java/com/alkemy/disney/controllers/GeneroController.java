package com.alkemy.disney.controllers;

import com.alkemy.disney.dtos.GeneroDTO;
import com.alkemy.disney.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class GeneroController {

    @Autowired
    private GeneroRepository generoRepository;

    @GetMapping("api/generos")
    public List<GeneroDTO> getPersonajes(){
        return generoRepository.findAll().stream().map(GeneroDTO::new).collect(toList());
    }
}
