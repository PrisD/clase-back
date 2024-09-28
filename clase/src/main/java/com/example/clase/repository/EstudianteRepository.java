package com.example.clase.repository;

import com.example.clase.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

    List<Estudiante> findAllByCurso_Id(Long curso_id);


}
