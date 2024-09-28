package com.example.clase.service.docente;

import com.example.clase.entity.Docente;
import com.example.clase.entity.Estudiante;
import com.example.clase.repository.DocenteRepository;
import com.example.clase.service.curso.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DocenteServiceImp implements DocenteService {

    DocenteRepository docenteRepository;
    CursoService cursoService;

    @Autowired
    public DocenteServiceImp(DocenteRepository docenteRepository, CursoService cursoService) {
        this.docenteRepository = docenteRepository;
        this.cursoService = cursoService;
    }

    @Override
    public Long post(Docente docente) {
        return docenteRepository.save(docente).getId();
    }

    @Override
    public void update(Docente docente) {
        docenteRepository.save(docente);
    }

    @Override
    public void deleteById(Integer id) {
        docenteRepository.deleteById(id);
    }

    @Override
    public Optional<Docente> findById(Integer id){
        return docenteRepository.findById(id);
    }

    @Override
    public List<Estudiante> getAlumnosActivos(Integer id) {
        return new ArrayList<>();
    }
}
