package com.alkemy.disney.dtos;

import com.alkemy.disney.models.Genero;
import com.alkemy.disney.models.PeliculaSerie;

import java.util.Set;

public class GeneroDTO {

    //atributos
    private long id;
    private String nombre;
    private String imagen;
    private Set<PeliculaSerie> peliculasSeries;

    //constructor
    public GeneroDTO(Genero genero) {
        this.id = genero.getId();
        this.nombre = genero.getNombre();
        this.imagen = genero.getImagen();
        this.peliculasSeries = genero.getPeliculasSeries();
    }

    //getter y setter
    public long getId() {
        return id;
    }

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

    public Set<PeliculaSerie> getPeliculasSeries() {
        return peliculasSeries;
    }

    public void setPeliculasSeries(Set<PeliculaSerie> peliculasSeries) {
        this.peliculasSeries = peliculasSeries;
    }
}
