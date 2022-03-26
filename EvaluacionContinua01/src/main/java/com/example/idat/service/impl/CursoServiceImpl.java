package com.example.idat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.idat.model.Curso;
import com.example.idat.repository.CursoRepository;
import com.example.idat.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository curso;
	
	@Override
	public void guardarCurso(Curso c) {
		// TODO Auto-generated method stub

		 curso.save(c);
	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub

		curso.deleteById(id);
	}

	@Override
	public void editarCurso(Curso c) {
		// TODO Auto-generated method stub

		curso.saveAndFlush(c);
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return curso.findAll();
	}

	@Override
	public Curso cursoById(Integer id) {
		// TODO Auto-generated method stub
		return curso.findById(id).orElse(null);
	}

}
