package com.corhuila.registronotas.IRepository;

import com.corhuila.registronotas.Entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotaRepository extends JpaRepository<Nota, Long> {
}
