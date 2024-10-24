package com.example.clase.controller;

import com.example.clase.entity.Estudiante;
import com.example.clase.service.estudiante.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public List<Estudiante> getEstudiantes() {
        return estudianteService.findAll();
    }

    @GetMapping("/estudiante")
    public Optional<Estudiante> getEstudiante(@RequestParam Integer id) {
        return estudianteService.findById(id);
    }

    @PostMapping("/estudiante")
    public String addEstudiante(@RequestBody Estudiante estudiante) {
        Long id = estudianteService.post(estudiante);
        return "Estudiante creado con id = " + id;
    }

    @PutMapping("/estudiante")
    public void editEstudiante(@RequestBody Estudiante estudiante){
        estudianteService.update(estudiante);
    }

    @DeleteMapping("/estudiante")
    public void deleteEstudiante(Integer id){
        estudianteService.deleteById(id);
    }
}
