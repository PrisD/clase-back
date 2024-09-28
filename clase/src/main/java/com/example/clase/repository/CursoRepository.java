package com.example.clase.repository;

import com.example.clase.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

    List<Curso> findByFechaFin(LocalDate fechaFin);
}
