package com.example.clase.repository;

import com.example.clase.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Integer> {


    Curso findByDocente_IdAndFechaFinIsAfter(Long docente_id, LocalDate fechaFin);

    List<Curso> findAllByFechaFin(LocalDate fechaFin);
}
