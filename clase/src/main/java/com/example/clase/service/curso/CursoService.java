package com.example.clase.service.curso;

import com.example.clase.entity.Curso;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CursoService {

    Long post(Curso curso);

    void update(Curso curso);

    void deleteById(Integer id);

    Optional<Curso> findById(Integer id);

    List<Curso> cursosActivosSegunFecha(Date fecha);

}
