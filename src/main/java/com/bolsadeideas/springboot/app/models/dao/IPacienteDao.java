package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Paciente;


public interface IPacienteDao  extends CrudRepository<Paciente, Long>{


}
