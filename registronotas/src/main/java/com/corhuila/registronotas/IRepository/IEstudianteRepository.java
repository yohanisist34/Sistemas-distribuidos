package com.corhuila.registronotas.IRepository;

import com.corhuila.registronotas.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
}
