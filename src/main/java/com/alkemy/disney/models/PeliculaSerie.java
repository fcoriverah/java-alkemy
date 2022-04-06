package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PeliculaSerie {

    //toda entidad necesita tener un ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native") //generar valor para el ID,
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    //relaacion
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="personaje_id")
    private Personaje personaje;

    //relacion con PersonajePeliculaSerie
    @OneToMany(mappedBy="peliculaSerie", fetch=FetchType.EAGER)
    private Set<PersonajePeliculaSerie> personajePeliculasSeries = new HashSet<>();

    @OneToMany(mappedBy="peliculaSerie", fetch=FetchType.EAGER)
    private Set<GeneroPeliculaSerie> generoPeliculaSeries = new HashSet<>();

    //atributos
    private String imagen;
    private String titulo;
    private LocalDateTime fechaCreacion;
    private Integer calificacion;

    //constructor
    public PeliculaSerie() {
    }

    public PeliculaSerie(Personaje personaje, String imagen, String titulo, LocalDateTime fechaCreacion, Integer calificacion) {
        this.personaje = personaje;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
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

    public Set<PersonajePeliculaSerie> getPersonajePeliculasSeries() {
        return personajePeliculasSeries;
    }

    public void setPersonajePeliculasSeries(Set<PersonajePeliculaSerie> personajePeliculasSeries) {
        this.personajePeliculasSeries = personajePeliculasSeries;
    }

    public Set<GeneroPeliculaSerie> getGeneroPeliculaSeries() {
        return generoPeliculaSeries;
    }

    public void setGeneroPeliculaSeries(Set<GeneroPeliculaSerie> generoPeliculaSeries) {
        this.generoPeliculaSeries = generoPeliculaSeries;
    }
}
