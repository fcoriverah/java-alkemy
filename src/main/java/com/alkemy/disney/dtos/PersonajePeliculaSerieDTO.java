package com.alkemy.disney.dtos;

import com.alkemy.disney.models.PersonajePeliculaSerie;

import java.time.LocalDateTime;

public class PersonajePeliculaSerieDTO {

    //atributos
    private long pelicula_id;
    private String imagen;
    private String titulo;
    private LocalDateTime fechaCreacion;
    private Integer calificacion;

    //constructor

    public PersonajePeliculaSerieDTO(PersonajePeliculaSerie personajePeliculaSerie) {
        this.pelicula_id = personajePeliculaSerie.getPeliculaSerie().getId();
        this.imagen = personajePeliculaSerie.getPeliculaSerie().getImagen();
        this.titulo = personajePeliculaSerie.getPeliculaSerie().getTitulo();
        this.fechaCreacion = personajePeliculaSerie.getPeliculaSerie().getFechaCreacion();
        this.calificacion = personajePeliculaSerie.getPeliculaSerie().getCalificacion();
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
