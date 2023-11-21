package com.corhuila.registronotas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idProfesor;
    private String nombre;
}
