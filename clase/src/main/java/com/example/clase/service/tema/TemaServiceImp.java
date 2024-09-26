package com.example.clase.service.tema;

import com.example.clase.entity.Tema;
import com.example.clase.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TemaServiceImp implements TemaService {

    @Autowired
    private TemaRepository temaRepository;

    @Override
    public Long post(Tema tema) {
        return temaRepository.save(tema).getId();
    }

    @Override
    public void update(Tema tema) {
        temaRepository.save(tema);
    }

    @Override
    public void deleteById(Integer id) {
        temaRepository.deleteById(id);
    }

    @Override
    public Optional<Tema> findById(Integer id) {
        return temaRepository.findById(id);
    }
}
