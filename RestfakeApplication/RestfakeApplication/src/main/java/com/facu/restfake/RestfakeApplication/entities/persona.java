package com.facu.restfake.RestfakeApplication.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class persona extends Base{
   
    @Column(name = "nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name = "DNI")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany (cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(
        name = "persona_libro",
        joinColumns = @JoinColumn(name ="persona_id"),
        inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}
