package com.corhuila.registronotas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idNota;

    @ManyToOne
    @JoinColumn(name="idEstudiante")
    private Estudiante unEstudiante;
    @ManyToOne
    @JoinColumn(name = "id_asignatura")
    private Asignatura unaAsignatura;
    @ManyToOne
    @JoinColumn(name = "idProfesor")
    private Profesor unaProfesor;

    private int nota;

}
