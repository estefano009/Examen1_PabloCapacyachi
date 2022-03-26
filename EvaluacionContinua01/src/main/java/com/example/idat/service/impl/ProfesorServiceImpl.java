package com.example.idat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.idat.model.Profesor;
import com.example.idat.repository.ProfesorRepository;
import com.example.idat.service.ProfesorService;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository profesor;
	
	@Override
	public void guardarProfesor(Profesor p) {
		// TODO Auto-generated method stub
		profesor.save(p);
	}

	@Override
	public void eliminarProfesor(Integer id) {
		// TODO Auto-generated method stub
		profesor.deleteById(id);
	}

	@Override
	public void editarProfesor(Profesor p) {
		// TODO Auto-generated method stub

		profesor.saveAndFlush(p);
	}

	@Override
	public List<Profesor> listaProfesor() {
		// TODO Auto-generated method stub
		return profesor.findAll();
	}

	@Override
	public Profesor profesorById(Integer id) {
		// TODO Auto-generated method stub
		return profesor.findById(id).orElse(null);
	}

}
