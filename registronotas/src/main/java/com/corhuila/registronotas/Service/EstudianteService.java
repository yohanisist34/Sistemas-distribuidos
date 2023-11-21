package com.corhuila.registronotas.Service;

import com.corhuila.registronotas.Entity.Estudiante;
import com.corhuila.registronotas.Entity.Nota;
import com.corhuila.registronotas.IRepository.IEstudianteRepository;
import com.corhuila.registronotas.IRepository.INotaRepository;
import com.corhuila.registronotas.IService.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EstudianteService implements IEstudianteService {

    @Autowired
    private IEstudianteRepository iEstudianteRepository;

    @Override
    public List<Estudiante> all() {
        return iEstudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        return iEstudianteRepository.findById(id);
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return iEstudianteRepository.save(estudiante);
    }

    @Override
    public void update(Estudiante estudiante, Long id) {

        Optional<Estudiante> op = iEstudianteRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Estudiante estup = op.get();
            estup.setNombre(estudiante.getNombre());


            //Actualizar el objeto
            iEstudianteRepository.save(estup);
        }
    }

    @Override
    public void delete(Long id) {
        iEstudianteRepository.deleteById(id);
    }
}
