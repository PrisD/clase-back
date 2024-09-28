package com.example.clase.service.estudiante;

import com.example.clase.entity.Curso;
import com.example.clase.entity.Estudiante;
import com.example.clase.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImp implements EstudianteService {


    EstudianteRepository estudianteRepository;


    @Autowired
    public EstudianteServiceImp(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Integer id){
        return estudianteRepository.findById(id);
    }

    @Override
    public Long post(Estudiante estudiante){
        return estudianteRepository.save(estudiante).getId();
    }

    @Override
    public void update(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteById(Integer id){
        estudianteRepository.deleteById(id);
    }

    @Override
    public List<Estudiante> alumnosEnCurso(Long cursoId) {
        return estudianteRepository.findAllByCurso_Id(cursoId);
    }


}
