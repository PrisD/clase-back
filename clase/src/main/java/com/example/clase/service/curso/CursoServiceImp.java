package com.example.clase.service.curso;

import com.example.clase.entity.Curso;
import com.example.clase.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImp implements CursoService {

    @Autowired
    CursoRepository cursoRepository;


    @Override
    public Long post(Curso curso) {
        cursoRepository.save(curso);
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
    public List<Curso> cursosActivosSegunFecha(Date fecha){
        List<Curso> cursosSegunFecha = new ArrayList<Curso>();
        cursoRepository.findAll().forEach(
                curso -> {
                    if (curso.getFechaFin() == fecha){
                        cursosSegunFecha.add(curso);
                    }
                }
        );
        return cursosSegunFecha;
    }
}
