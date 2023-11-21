package com.corhuila.registronotas.IRepository;

import com.corhuila.registronotas.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorRepository extends JpaRepository<Profesor, Long> {
}
