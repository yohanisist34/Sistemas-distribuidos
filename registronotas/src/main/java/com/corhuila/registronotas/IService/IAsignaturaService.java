package com.corhuila.registronotas.IService;

import com.corhuila.registronotas.Entity.Asignatura;
import com.corhuila.registronotas.Entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IAsignaturaService {
    List<Asignatura> all();
    public Optional<Asignatura> findById(Long id);
    public Asignatura save(Asignatura asignatura);
    public void update(Asignatura asignatura, Long id);
    public void delete(Long id);
}
