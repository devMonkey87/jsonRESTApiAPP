package com.bolsadeideas.springboot.app.models.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IPacienteDao;
import com.bolsadeideas.springboot.app.models.entity.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteDao pacienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Paciente> findAll() {

		return (List<Paciente>) pacienteDao.findAll();

	}

	@Override
	@Transactional
	public Paciente save(Paciente paciente) {

		return pacienteDao.save(paciente);
	}

	@Override
	@Transactional(readOnly = true)

	public Paciente findOne(Long id) {

		return pacienteDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		pacienteDao.delete(id);

	}

}
