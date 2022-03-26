package com.example.idat.service;

import java.util.List;

import com.example.idat.model.Profesor;


public interface ProfesorService {
	
	public void guardarProfesor(Profesor p);
	public void eliminarProfesor(Integer id);
	public void editarProfesor(Profesor p);
	public List<Profesor> listaProfesor();
	public Profesor profesorById(Integer id);

}
