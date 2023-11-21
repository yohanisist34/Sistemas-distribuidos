package com.corhuila.registronotas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idEstudiante;
    private String nombre;
}
