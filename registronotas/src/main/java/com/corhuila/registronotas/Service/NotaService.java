package com.corhuila.registronotas.Service;

import com.corhuila.registronotas.Entity.Nota;
import com.corhuila.registronotas.IRepository.INotaRepository;
import com.corhuila.registronotas.IService.INotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService implements INotaService {
    @Autowired
    private INotaRepository inotaRepository;

    @Override
    public List<Nota> all() {
        return inotaRepository.findAll();
    }

    @Override
    public Optional<Nota> findById(Long id) {
        return inotaRepository.findById(id);
    }

    @Override
    public Nota save(Nota nota) {
        return inotaRepository.save(nota);
    }

    @Override
    public void update(Nota nota, Long id) {

        Optional<Nota> op = inotaRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Nota notup = op.get();
            notup.setNota(nota.getNota());


            //Actualizar el objeto
            inotaRepository.save(notup);
        }
    }

    @Override
    public void delete(Long id) {
        inotaRepository.deleteById(id);
    }
}
