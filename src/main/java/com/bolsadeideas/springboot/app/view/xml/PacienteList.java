package com.bolsadeideas.springboot.app.view.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bolsadeideas.springboot.app.models.entity.Paciente;

@XmlRootElement(name="pacientes")
public class PacienteList {
	
	@XmlElement(name="paciente")
	public List<Paciente> pacientes;

	public PacienteList() {}


	public PacienteList(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}


}
