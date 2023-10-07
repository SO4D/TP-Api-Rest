package com.utn.apiRestSinPaginacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;
}
