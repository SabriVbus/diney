package com.diney.chalenge.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private int edad;
    private String historia;
    private String imagen;
    private String nombre;
    private double peso;

    @ManyToMany(mappedBy = "peliculas", cascade = CascadeType.ALL)
    private List<Pelicula> peliculas = new ArrayList<>();
}
