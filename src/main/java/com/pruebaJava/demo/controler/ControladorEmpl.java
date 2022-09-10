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
import com.pruebaJava.demo.modelo.Empleado;

import javax.validation.Valid;


@Controller
@RequestMapping
public class ControladorEmpl {

	@Autowired
	private IempleadoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado> empleados = service.listar();
		model.addAttribute("empleados", empleados);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("empleado", new Empleado());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Empleado e, Model model) {
		service.save(e);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Empleado> empleado = service.listarId(id);
		model.addAttribute("empleado", empleado);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}











