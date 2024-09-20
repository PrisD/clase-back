package com.example.clase.service;

import com.example.clase.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    List<Estudiante> findAll();

    Optional<Estudiante> findById(Integer id);

    void post(Estudiante estudiante);

    void update(Estudiante estudiante);

    void deleteById(Integer id);

}
