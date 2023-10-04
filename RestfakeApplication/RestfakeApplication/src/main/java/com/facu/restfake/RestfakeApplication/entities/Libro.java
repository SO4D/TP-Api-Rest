package com.facu.restfake.RestfakeApplication.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Libro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Libro extends Base{

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private int fecha;

    @Column(name="genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
