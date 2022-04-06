package com.alkemy.disney.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    //relacion con PersonajePeliculaSerie
    @OneToMany(mappedBy="personaje", fetch=FetchType.EAGER)
    private Set<PersonajePeliculaSerie> personajePeliculasSeries = new HashSet<>();

    //atributos
    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;

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

    public Set<PersonajePeliculaSerie> getPersonajePeliculasSeries() {
        return personajePeliculasSeries;
    }

    public void setPersonajePeliculasSeries(Set<PersonajePeliculaSerie> personajePeliculasSeries) {
        this.personajePeliculasSeries = personajePeliculasSeries;
    }
}
