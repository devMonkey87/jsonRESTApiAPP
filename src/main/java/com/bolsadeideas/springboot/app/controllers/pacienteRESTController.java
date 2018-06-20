package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Paciente;
import com.bolsadeideas.springboot.app.models.service.IPacienteService;
import com.bolsadeideas.springboot.app.view.xml.PacienteList;

@RestController
@RequestMapping("/api")
public class pacienteRESTController {

	@Autowired
	private IPacienteService pacienteService;

	@RequestMapping(value = { "/pacientes" }, method = RequestMethod.GET)

	public PacienteList listar() {

		return new PacienteList(pacienteService.findAll());
	}

	@GetMapping("/pacientes/{id}")
	
	public Paciente mostrar(@PathVariable Long id) {
		return  pacienteService.findOne(id);
	}

	@PostMapping("pacientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Paciente crear(@RequestBody Paciente paciente) {
		return pacienteService.save(paciente);
	}

	@PutMapping("pacientes/{id")
	@ResponseStatus(HttpStatus.CREATED)

	public Paciente update(@RequestBody Paciente paciente, @PathVariable Long id) {
		Paciente pacienteActual = pacienteService.findOne(id);
		pacienteActual.setApellido(paciente.getApellido());
		pacienteActual.setNombre(paciente.getNombre());
		pacienteActual.setUsuario(paciente.getUsuario());
		pacienteActual.setContraseña(paciente.getContraseña());
		return pacienteService.save(pacienteActual);

	}

	@DeleteMapping("pacientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)

	public void delete(@PathVariable Long id) {
		pacienteService.delete(id);
	}

}
