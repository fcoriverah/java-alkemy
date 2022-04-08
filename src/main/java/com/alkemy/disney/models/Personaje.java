package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Personaje {

    //toda entidad necesita tener un ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native") //generar valor para el ID,
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    //atributos
    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;

    //relacion ManyToMany con peliculaSeries
    @ManyToMany(mappedBy = "personajes")
    private Set<PeliculaSerie> peliculasSeries = new HashSet<>();

    //constructor
    public Personaje() {
    }

    public Personaje( String imagen, String nombre, Integer edad, Double peso, String historia) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
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

    @JsonIgnore
    public Set<PeliculaSerie> getPeliculasSeries() {
        return peliculasSeries;
    }

    public void setPeliculasSeries(Set<PeliculaSerie> peliculasSeries) {
        this.peliculasSeries = peliculasSeries;
    }
}
