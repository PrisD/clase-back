package com.example.clase.service.tema;

import com.example.clase.entity.Tema;

import java.util.List;
import java.util.Optional;

public interface TemaService {
    Long post(Tema tema);

    void update(Tema tema);

    void deleteById(Integer id);

    Optional<Tema> findById(Integer id);

    List<Tema> findAll();
}
