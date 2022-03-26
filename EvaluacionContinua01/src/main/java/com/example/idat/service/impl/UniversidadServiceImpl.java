package com.example.idat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.idat.model.Universidad;
import com.example.idat.repository.UniversidadRepository;
import com.example.idat.service.UniversidadService;

@Service
public class UniversidadServiceImpl implements UniversidadService {

	
	@Autowired
	private UniversidadRepository universidad;
	
	@Override
	public void guardarUniversidad(Universidad u) {
		// TODO Auto-generated method stub

		universidad.save(u);
	}

	@Override
	public void eliminarUnivarsidad(Integer id) {
		// TODO Auto-generated method stub
		universidad.deleteById(id);
	}

	@Override
	public void editarUniversidad(Universidad u) {
		// TODO Auto-generated method stub
		universidad.saveAndFlush(u);
	}

	@Override
	public List<Universidad> listarUniversidad() {
		// TODO Auto-generated method stub
		return universidad.findAll();
	}

	@Override
	public Universidad universidadByID(Integer id) {
		// TODO Auto-generated method stub
		return universidad.findById(id).orElse(null);
	}

}
