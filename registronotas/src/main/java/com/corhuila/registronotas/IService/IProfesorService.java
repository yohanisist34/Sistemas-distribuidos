package com.corhuila.registronotas.IService;

import com.corhuila.registronotas.Entity.Nota;
import com.corhuila.registronotas.Entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface IProfesorService {
    List<Profesor> all();
    public Optional<Profesor> findById(Long id);
    public Profesor save(Profesor profesor);
    public void update(Profesor profesor, Long id);
    public void delete(Long id);

}
