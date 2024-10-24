package com.example.clase.service.curso;

import com.example.clase.entity.Curso;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CursoService {

    Long post(Curso curso);

    void update(Curso curso);

    void deleteById(Integer id);

    Optional<Curso> findById(Integer id);

    List<Curso> cursosSegunFechaFin(LocalDate fecha);

    Curso cursosActivosPorProfesor(Long idProfesor);

    List<Curso> findAll();
}
