package com.example.clase.service.estudiante;

import com.example.clase.entity.Curso;
import com.example.clase.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    List<Estudiante> findAll();

    Optional<Estudiante> findById(Integer id);

    Long post(Estudiante estudiante);

    void update(Estudiante estudiante);

    void deleteById(Integer id);

    List<Estudiante> alumnosEnCurso(Long cursoId);
}
