package com.alkemy.disney.dtos;

import com.alkemy.disney.models.PeliculaSerie;
import com.alkemy.disney.models.Personaje;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;
import java.util.stream.Collectors;

public class PersonajeDTO {

    //atributos
    private long id;
    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;
    private Set<PeliculaSerie> peliculasSeries;

    //constructor
    public PersonajeDTO(Personaje personaje) {
        this.id = personaje.getId();
        this.imagen = personaje.getImagen();
        this.nombre = personaje.getNombre();
        this.edad = personaje.getEdad();
        this.peso = personaje.getPeso();
        this.historia = personaje.getHistoria();
        this.peliculasSeries = personaje.getPeliculasSeries();
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Set<PeliculaSerie> getPeliculasSeries() {
        return peliculasSeries;
    }

    public void setPeliculasSeries(Set<PeliculaSerie> peliculasSeries) {
        this.peliculasSeries = peliculasSeries;
    }
}
