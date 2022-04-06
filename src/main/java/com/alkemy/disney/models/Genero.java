package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Genero {

    //toda entidad necesita tener un ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native") //generar valor para el ID,
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    //relaacion
    @OneToMany(mappedBy="genero", fetch=FetchType.EAGER)
    private Set<GeneroPeliculaSerie> generoPeliculaSeries = new HashSet<>();

    //atributos
    private String nombre;
    private String imagen;

    //constructor
    public Genero() {
    }

    public Genero(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    //getters y setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Set<GeneroPeliculaSerie> getGeneroPeliculaSeries() {
        return generoPeliculaSeries;
    }

    public void setGeneroPeliculaSeries(Set<GeneroPeliculaSerie> generoPeliculaSeries) {
        this.generoPeliculaSeries = generoPeliculaSeries;
    }
}
