package com.itesm.demo.repository;

import com.itesm.demo.model.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno,Integer> {
}
