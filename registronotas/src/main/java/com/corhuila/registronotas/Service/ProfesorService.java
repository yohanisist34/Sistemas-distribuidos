package com.corhuila.registronotas.Service;

import com.corhuila.registronotas.Entity.Nota;
import com.corhuila.registronotas.Entity.Profesor;
import com.corhuila.registronotas.IRepository.IProfesorRepository;
import com.corhuila.registronotas.IService.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProfesorService implements IProfesorService {

    @Autowired
    private IProfesorRepository iProfesorRepository;

    @Override
    public List<Profesor> all() {
        return iProfesorRepository.findAll();
    }

    @Override
    public Optional<Profesor> findById(Long id) {
        return iProfesorRepository.findById(id);
    }

    @Override
    public Profesor save(Profesor profesor) {
        return iProfesorRepository.save(profesor);
    }

    @Override
    public void update(Profesor profesor, Long id) {

        Optional<Profesor> op = iProfesorRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Profesor profesorup = op.get();
            profesorup.setNombre(profesor.getNombre());


            //Actualizar el objeto
            iProfesorRepository.save(profesorup);
        }
    }

    @Override
    public void delete(Long id) {
        iProfesorRepository.deleteById(id);
    }
}
