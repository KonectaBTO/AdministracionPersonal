package com.pruebaJava.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebaJava.demo.interfaceService.IempleadoService;
import com.pruebaJava.demo.interfaceService.IsolicitudService;
import com.pruebaJava.demo.modelo.Empleado;
import com.pruebaJava.demo.modelo.Solicitud;
import javax.validation.Valid;


@Controller
@RequestMapping
public class ControladorSolic {

	
	@Autowired
	private IempleadoService serviceEmpleados;
	
	@Autowired
	private IsolicitudService service;
	
	@GetMapping("/listarSolic")
	public String listar(Model model) {
		List<Solicitud> solicitudes = service.listar();
		model.addAttribute("solicitudes", solicitudes);
		return "indexSolic";
		
	}
	
	@GetMapping("/newSolic")
	public String agregar(Model model) {
		model.addAttribute("solicitud", new Solicitud());
		List<Empleado> empleados = serviceEmpleados.listar();
		model.addAttribute("empleados", empleados);
		return "formSolic";
	}
	
	@PostMapping("/saveSolic")
	public String save(@Valid Solicitud s, Model model) {
		service.save(s);
		return "redirect:/listarSolic";
	}
	
	@GetMapping("/editarSolic/{idSolicitud}")
	public String editar(@PathVariable int idSolicitud, Model model) {
		Optional<Solicitud> solicitud = service.listarId(idSolicitud);
		model.addAttribute("solicitud", solicitud);
		List<Empleado> empleados = serviceEmpleados.listar();
		model.addAttribute("empleados", empleados);
		return "formSolic";
	}
	
	@GetMapping("/eliminarSolic/{idSolicitud}")
	public String delete(@PathVariable int idSolicitud, Model model) {
		service.delete(idSolicitud);
		return "redirect:/listarSolic";
	}
}



















