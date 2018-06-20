package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Paciente;


public interface IPacienteService {
	
	public List<Paciente> findAll();

	public Paciente save(Paciente paciente);
	
	public Paciente findOne(Long id);
	
	public void delete(Long id);
}
