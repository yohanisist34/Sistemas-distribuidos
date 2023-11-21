package com.corhuila.registronotas.IService;

import com.corhuila.registronotas.Entity.Estudiante;
import com.corhuila.registronotas.Entity.Nota;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService {
    List<Estudiante> all();
    public Optional<Estudiante> findById(Long id);
    public Estudiante save(Estudiante estudiante);
    public void update(Estudiante estudiante, Long id);
    public void delete(Long id);
}
