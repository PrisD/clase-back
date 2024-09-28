package com.example.clase.service.curso;

import com.example.clase.entity.Curso;
import com.example.clase.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImp implements CursoService {

    CursoRepository cursoRepository;

    @Autowired
    public CursoServiceImp(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }


    @Override
    public Long post(Curso curso) {
        return cursoRepository.save(curso).getId();
    }

    @Override
    public void update(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void deleteById(Integer id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public Optional<Curso> findById(Integer id) {
        return cursoRepository.findById(id);
    }

    @Override
    public List<Curso> cursosSegunFechaFin(LocalDate fecha){
        return cursoRepository.findByFechaFin(fecha);
    }
}
