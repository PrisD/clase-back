package com.example.clase.service.docente;

import com.example.clase.entity.Docente;
import com.example.clase.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface DocenteService {

    Long post(Docente docente);

    void update(Docente docente);

    void deleteById(Integer id);

    Optional<Docente> findById(Integer id);

    List<Estudiante> getAlumnosActivos(Long id);
}
