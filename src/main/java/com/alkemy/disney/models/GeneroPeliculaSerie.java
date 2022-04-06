package com.alkemy.disney.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class GeneroPeliculaSerie {

    //toda entidad necesita tener un ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native") //generar valor para el ID,
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    //relaciones
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="genero_id")
    private Genero genero;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="peliculaSerie_id")
    private PeliculaSerie peliculaSerie;

    private String nombre;
    private String imagen;

    //constructor
    public GeneroPeliculaSerie() {
    }

    public GeneroPeliculaSerie(Genero genero, PeliculaSerie peliculaSerie) {
        this.genero = genero;
        this.peliculaSerie = peliculaSerie;
        this.nombre = genero.getNombre();
        this.imagen = genero.getImagen();
    }

    //getter y setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public PeliculaSerie getPeliculaSerie() {
        return peliculaSerie;
    }

    public void setPeliculaSerie(PeliculaSerie peliculaSerie) {
        this.peliculaSerie = peliculaSerie;
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
}
