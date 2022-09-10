package com.pruebaJava.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebaJava.demo.modelo.Empleado;

@Repository
public interface Iempleado extends CrudRepository<Empleado, Integer>{

}
