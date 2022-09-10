package com.pruebaJava.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaJava.demo.interfaceService.IsolicitudService;
import com.pruebaJava.demo.interfaces.Isolicitud;
import com.pruebaJava.demo.modelo.Solicitud;

@Service
public class SolicitudService  implements IsolicitudService{

	@Autowired
	private Isolicitud data;
	
	@Override
	public List<Solicitud> listar() {
		return (List<Solicitud>)data.findAll();
	}

	@Override
	public Optional<Solicitud> listarId(int idSolicitud) {
		return data.findById(idSolicitud);
	}

	@Override
	public int save(Solicitud s) {
		int res=0;
		Solicitud solicitud= data.save(s);
		if(!solicitud.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idSolicitud) {
		data.deleteById(idSolicitud);
	}

}



