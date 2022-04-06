package com.alkemy.disney.dtos;

import com.alkemy.disney.models.GeneroPeliculaSerie;
import com.alkemy.disney.models.PersonajePeliculaSerie;

import java.time.LocalDateTime;
import java.util.Set;

public class GeneroPeliculaSerieDTO {

    //atributos
    private long pelicula_id;
    private String imagen;
    private String titulo;
    private LocalDateTime fechaCreacion;
    private Integer calificacion;

    //constructor
    public GeneroPeliculaSerieDTO() {
    }

    public GeneroPeliculaSerieDTO(GeneroPeliculaSerie generoPeliculaSerie) {
        this.pelicula_id = generoPeliculaSerie.getPeliculaSerie().getId();
        this.imagen = generoPeliculaSerie.getPeliculaSerie().getImagen();
        this.titulo = generoPeliculaSerie.getPeliculaSerie().getTitulo();
        this.fechaCreacion = generoPeliculaSerie.getPeliculaSerie().getFechaCreacion();
        this.calificacion = generoPeliculaSerie.getPeliculaSerie().getCalificacion();
    }

    //getter y setter
    public long getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(long pelicula_id) {
        this.pelicula_id = pelicula_id;
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
}
