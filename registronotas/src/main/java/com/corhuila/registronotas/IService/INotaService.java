package com.corhuila.registronotas.IService;

import com.corhuila.registronotas.Entity.Nota;

import java.util.List;
import java.util.Optional;

public interface INotaService {
    List<Nota> all();
    public Optional<Nota> findById(Long id);
    public Nota save(Nota nota);
    public void update(Nota nota, Long id);
    public void delete(Long id);
}
