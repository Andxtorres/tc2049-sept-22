package com.itesm.demo.controller;


import com.itesm.demo.model.Alumno;
import com.itesm.demo.serivce.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @PostMapping("/crear")
    public ResponseEntity<Alumno> saveAlumno(@RequestBody Alumno alumno){
        return new ResponseEntity<>(alumnoService.insertaAlumno(alumno), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable("id") int id){
        return new ResponseEntity<>(alumnoService.findById(id), HttpStatus.OK);
    }
}
