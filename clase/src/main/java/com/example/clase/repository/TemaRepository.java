package com.example.clase.repository;

import com.example.clase.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Integer> {
}
