package com.example.clase.controller;

import com.example.clase.entity.Curso;
import com.example.clase.service.curso.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {
    
    @Autowired
    private CursoService cursoService;

    @PostMapping("/curso")
    public String addCurso(@RequestBody Curso curso) {
        Long id =cursoService.post(curso);
        return "Curso creado con id= "+ id;
    }

    @PutMapping("/curso")
    public void updateCurso(@RequestBody Curso curso) { cursoService.update(curso); }

    @DeleteMapping("/curso")
    public void deleteCurso(Integer id ){ cursoService.deleteById(id);}

    @GetMapping("/curso")
    public Optional<Curso> getCurso (Integer id) { return cursoService.findById(id); }

    @GetMapping("/cursos")
    public List<Curso> getCursos() {
        return cursoService.findAll();
    }

    @GetMapping("/cursos-fin")
    public List<Curso> getCursosSegunFechaFin(@RequestParam LocalDate fecha){ return cursoService.cursosSegunFechaFin(fecha); }

}
