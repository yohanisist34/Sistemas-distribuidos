package com.corhuila.registronotas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idAsignatura;
    private String nombre;
}
