package com.alkemy.disney.dtos;

import com.alkemy.disney.models.Genero;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.stream.Collectors;

public class GeneroDTO {

    @Autowired


    //atributos
    private String nombre;
    private String imagen;
    private Set<GeneroPeliculaSerieDTO> peliculasSeries;

    //constructor
    public GeneroDTO(Genero genero) {
        this.nombre = genero.getNombre();
        this.imagen = genero.getImagen();
        this.peliculasSeries = genero.getGeneroPeliculaSeries().stream().map(GeneroPeliculaSerieDTO::new).collect(Collectors.toSet());
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Set<GeneroPeliculaSerieDTO> getPeliculasSeries() {
        return peliculasSeries;
    }

    public void setPeliculasSeries(Set<GeneroPeliculaSerieDTO> peliculasSeries) {
        this.peliculasSeries = peliculasSeries;
    }
}
