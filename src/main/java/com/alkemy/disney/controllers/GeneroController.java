package com.alkemy.disney.controllers;

import com.alkemy.disney.dtos.GeneroDTO;
import com.alkemy.disney.repositories.GeneroRepository;
import com.alkemy.disney.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class GeneroController {

    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private GeneroService generoService;

    //obtener todos los generos
    @GetMapping("api/generos")
    public List<GeneroDTO> getGeneros(){
        return generoRepository.findAll().stream().map(GeneroDTO::new).collect(toList());
    }

    //crear un genero nuevo
    @PostMapping("api/genero")
    public ResponseEntity<Object> createGenero(
            @RequestParam String imagen, @RequestParam String nombre
    ) {
        return generoService.crearGenero(imagen, nombre);
    }
}
