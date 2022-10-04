package com.itesm.demo.serivce;


import com.itesm.demo.model.Alumno;
import com.itesm.demo.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    public Alumno insertaAlumno(Alumno a){
        alumnoRepository.save(a);
        return a;
    }

    public Alumno findById(int id){
        return alumnoRepository.findById(id).get();
    }
}
