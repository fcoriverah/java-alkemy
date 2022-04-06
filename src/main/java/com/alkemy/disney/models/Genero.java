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


    //atributos
    private String number;
    private LocalDateTime creationDate;
    private Double balance;

    //constructor
    public Genero() {
    }

    public Genero(String number, LocalDateTime creationDate, double balance) {
        this.number = number;
        this.creationDate = creationDate;
        this.balance = balance;
    }

    //getters y setters


}
