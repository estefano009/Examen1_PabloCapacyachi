package com.example.idat.service;

import java.util.List;

import com.example.idat.model.Curso;



public interface CursoService {

	
	public void guardarCurso(Curso c);
	public void eliminarCurso(Integer id);
	public void editarCurso(Curso c);
	public List<Curso> listarCurso();
	public Curso cursoById(Integer id);
	
}
