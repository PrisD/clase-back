package com.example.clase.controller;

import com.example.clase.entity.Docente;
import com.example.clase.entity.Estudiante;
import com.example.clase.service.docente.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @PostMapping("/docente")
    public String addDocente(@RequestBody Docente docente) {
        Long id = docenteService.post(docente);
        return "Docente agregado con id ="+ id;
    }

    @PutMapping("/docente")
    public void updateDocente(@RequestBody Docente docente) { docenteService.update(docente); }

    @DeleteMapping("/docente")
    public void deleteDocente(Integer id ){ docenteService.deleteById(id);}

    @GetMapping("/docente")
    public Optional<Docente> getDocente (Integer id) { return docenteService.findById(id); }

    @GetMapping("/docentes")
    public List<Docente> getDocentes() {
        return docenteService.findAll();
    }

    @GetMapping("/docente/{id}/alumnos")
    public List<Estudiante> getAlumnosActivos(@PathVariable Long id){ return docenteService.getAlumnosActivos(id); }
}
