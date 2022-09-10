package com.pruebaJava.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.pruebaJava.demo.modelo.Empleado;

public interface IempleadoService {
	public List<Empleado>listar();
	public Optional<Empleado>listarId(int id);
	public int save(Empleado e);
	public void delete(int id);
	

}
