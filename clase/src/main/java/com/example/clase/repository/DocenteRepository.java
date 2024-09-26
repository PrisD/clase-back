package com.example.clase.repository;

import com.example.clase.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {
}
