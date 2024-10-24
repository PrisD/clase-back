package com.example.clase.service.docente;

import com.example.clase.entity.Curso;
import com.example.clase.entity.Docente;
import com.example.clase.entity.Estudiante;
import com.example.clase.repository.DocenteRepository;
import com.example.clase.service.curso.CursoService;
import com.example.clase.service.estudiante.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DocenteServiceImp implements DocenteService {

    DocenteRepository docenteRepository;
    CursoService cursoService;
    EstudianteService estudianteService;

    @Autowired
    public DocenteServiceImp(DocenteRepository docenteRepository, CursoService cursoService, EstudianteService estudianteService) {
        this.docenteRepository = docenteRepository;
        this.cursoService = cursoService;
        this.estudianteService = estudianteService;
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
    public List<Estudiante> getAlumnosActivos(Long id) {
       //  endpoint para que el profesor pueda conocer su curso, esto sería que el endpoint debe mostrar los alumnos del curso vigente de un profesor.
        Long cursoId = cursoService.cursosActivosPorProfesor(id).getId();
        return estudianteService.alumnosEnCurso(cursoId);
    }

    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }
}
