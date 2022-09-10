package com.pruebaJava.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebaJava.demo.modelo.Solicitud;

@Repository
public interface Isolicitud extends CrudRepository<Solicitud, Integer>{

}
