package com.example.clase.controller;

import com.example.clase.entity.Tema;
import com.example.clase.service.tema.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TemaController {

    @Autowired
    private TemaService temaService;

    @PostMapping("/tema")
    public String addTema(@RequestBody Tema tema) {
        Long id = temaService.post(tema);
        return "Tema agregado con id ="+ id;
    }

    @PutMapping("/tema")
    public void updateTema(@RequestBody Tema tema) { temaService.update(tema); }

    @DeleteMapping("/tema")
    public void deleteTema(Integer id) { temaService.deleteById(id); }

    @GetMapping("/tema")
    public Optional<Tema> getTema(Integer id) { return temaService.findById(id); }

    @GetMapping("/temas")
    public List<Tema> getTemas() {
        return temaService.findAll();
    }
}
