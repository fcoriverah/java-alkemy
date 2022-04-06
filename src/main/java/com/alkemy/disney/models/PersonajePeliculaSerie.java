package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class PersonajePeliculaSerie {

    //toda entidad necesita tener un ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native") //generar valor para el ID,
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    //relaciones
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="personaje_id")
    private Personaje personaje;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="peliculaSerie_id")
    private PeliculaSerie peliculaSerie;

    //atributos
    private String titulo;

    //constructor
    public PersonajePeliculaSerie() {
    }

    public PersonajePeliculaSerie(Personaje personaje, PeliculaSerie peliculaSerie) {
        this.personaje = personaje;
        this.peliculaSerie = peliculaSerie;
        this.titulo = peliculaSerie.getTitulo();
    }

    //getters y setters
    public long getId() {
        return id;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public PeliculaSerie getPeliculaSerie() {
        return peliculaSerie;
    }

    public void setPeliculaSerie(PeliculaSerie peliculaSerie) {
        this.peliculaSerie = peliculaSerie;
    }
}
