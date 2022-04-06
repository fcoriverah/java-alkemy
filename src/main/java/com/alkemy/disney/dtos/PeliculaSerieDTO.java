package com.alkemy.disney.dtos;

import com.alkemy.disney.models.PeliculaSerie;
import com.alkemy.disney.models.Personaje;

import java.time.LocalDateTime;

public class PeliculaSerieDTO {

    //atributos
    private String imagen;
    private String titulo;
    private LocalDateTime fechaCreacion;
    private Integer calificacion;

    //constructor

    public PeliculaSerieDTO(PeliculaSerie peliculaSerie) {
        this.imagen = peliculaSerie.getImagen();
        this.titulo = peliculaSerie.getTitulo();
        this.fechaCreacion = peliculaSerie.getFechaCreacion();
        this.calificacion = peliculaSerie.getCalificacion();
    }

    //getters y setters
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
