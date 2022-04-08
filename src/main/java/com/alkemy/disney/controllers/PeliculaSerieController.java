package com.alkemy.disney.controllers;

import com.alkemy.disney.dtos.PeliculaSerieDTO;
import com.alkemy.disney.dtos.PersonajeDTO;
import com.alkemy.disney.repositories.PeliculaSerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class PeliculaSerieController {

    @Autowired
    private PeliculaSerieRepository peliculaSerieRepository;

    @GetMapping("api/peliculas-series")
    public List<PeliculaSerieDTO> getPeliculasSeries(){
        return peliculaSerieRepository.findAll().stream().map(PeliculaSerieDTO::new).collect(toList());
    }
}
