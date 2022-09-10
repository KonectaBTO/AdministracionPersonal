package com.pruebaJava.demo.modelo;

import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "solicitud")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSolicitud;
	private Integer codigo;
	private String descripcion;
	private String resumen;
	//private Integer id_empleado;
	
	@ManyToOne
	@JoinColumn(name = "id_empleado")
	private Empleado empleado;
	
	
	
	
	public Solicitud() {
		// TODO Auto-generated constructor stub
	}

	public Solicitud(Integer idSolicitud, Integer codigo, String descripcion, String resumen, Empleado empleado) {
		super();
		this.idSolicitud = idSolicitud;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.resumen = resumen;
		this.empleado = empleado;
	}

	public Integer getId() {
		return idSolicitud;
	}

	public void setId(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public Empleado getId_empleado() {
		return empleado;
	}

	public void setId_empleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
}
