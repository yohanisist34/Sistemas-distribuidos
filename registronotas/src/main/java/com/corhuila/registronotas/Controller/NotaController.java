package com.corhuila.registronotas.Controller;

import com.corhuila.registronotas.Entity.Nota;
import com.corhuila.registronotas.IRepository.INotaRepository;
import com.corhuila.registronotas.IService.INotaService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/nota/")
public class NotaController {

    @Autowired
    private INotaService notaService;

    @PostMapping("save")
    public Nota save(@RequestBody Nota nota){
        return notaService.save(nota);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") Long id){
         notaService.delete(id);
    }

    @GetMapping()
    public List<Nota> listAll(){
        return notaService.all();
    }

    @PutMapping("{id}")
    public void update(@RequestBody Nota nota, @PathVariable Long id){
        notaService.update(nota, id);
    }
}
