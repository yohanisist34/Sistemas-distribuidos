package com.corhuila.registronotas.Service;

import com.corhuila.registronotas.Entity.Asignatura;
import com.corhuila.registronotas.IRepository.IAsignaturaRepository;
import com.corhuila.registronotas.IService.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AsignaturaService implements IAsignaturaService {

    @Autowired
    private IAsignaturaRepository iAsignaturaRepository;

    @Override
    public List<Asignatura> all() {
        return iAsignaturaRepository.findAll();
    }

    @Override
    public Optional<Asignatura> findById(Long id) {
        return iAsignaturaRepository.findById(id);
    }

    @Override
    public Asignatura save(Asignatura asignatura) {
        return iAsignaturaRepository.save(asignatura);
    }

    @Override
    public void update(Asignatura asignatura, Long id) {

        Optional<Asignatura> op = iAsignaturaRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Asignatura asigup = op.get();
            asigup.setNombre(asignatura.getNombre());


            //Actualizar el objeto
            iAsignaturaRepository.save(asigup);
        }
    }

    @Override
    public void delete(Long id) {
        iAsignaturaRepository.deleteById(id);
    }
}
