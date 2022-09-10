package com.pruebaJava.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.pruebaJava.demo.modelo.Solicitud;

public interface IsolicitudService {

	public List<Solicitud>listar();
	public Optional<Solicitud>listarId(int idSolicitud);
	public int save(Solicitud s);
	public void delete(int idSolicitud);
	
}
