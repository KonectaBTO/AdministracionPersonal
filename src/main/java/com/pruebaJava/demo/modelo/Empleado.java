package com.pruebaJava.demo.modelo;

import java.sql.Date;
//import java.time.LocalDate;
//import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEmpleado") 
	private Integer id;
	private Date fecha_ingreso;
	private String nombre;
	private Integer salario;
	
	@OneToMany(mappedBy = "empleado")
	private Set<Solicitud> solicitudes;
	

	public Empleado() {
		// TODO Auto-generated constructor stub
	}


	public Empleado(Integer id, Date fecha_ingreso, String nombre, Integer salario) {
		super();
		this.id = id;
		this.fecha_ingreso = fecha_ingreso;
		this.nombre = nombre;
		this.salario = salario;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}


	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getSalario() {
		return salario;
	}


	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	
	
}
