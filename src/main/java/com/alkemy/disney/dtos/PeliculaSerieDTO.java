package com.alkemy.disney.dtos;

import com.alkemy.disney.models.Genero;
import com.alkemy.disney.models.PeliculaSerie;
import com.alkemy.disney.models.Personaje;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class PeliculaSerieDTO {

    //atributos
    private long id;
    private String imagen;
    private String titulo;
    private LocalDateTime fechaCreacion;
    private Integer calificacion;
    private Set<Personaje> personajes;
    private Set<Genero> generos;

    //constructor

    public PeliculaSerieDTO(PeliculaSerie peliculaSerie) {
        this.id = peliculaSerie.getId();
        this.imagen = peliculaSerie.getImagen();
        this.titulo = peliculaSerie.getTitulo();
        this.fechaCreacion = peliculaSerie.getFechaCreacion();
        this.calificacion = peliculaSerie.getCalificacion();
        this.personajes = peliculaSerie.getPersonajes();
        this.generos = peliculaSerie.getGeneros();
    }

    //getters y setters
    public long getId() {
        return id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Set<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Set<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<Genero> generos) {
        this.generos = generos;
    }
}
