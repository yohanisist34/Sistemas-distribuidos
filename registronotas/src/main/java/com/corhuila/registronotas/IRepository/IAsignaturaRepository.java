package com.corhuila.registronotas.IRepository;

import com.corhuila.registronotas.Entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {
}
