package com.example.idat.service;

import java.util.List;

import com.example.idat.model.Universidad;


public interface UniversidadService {

	
	public void guardarUniversidad(Universidad u);
	public void eliminarUnivarsidad(Integer id);
	public void editarUniversidad(Universidad u);
	public List<Universidad> listarUniversidad();
	public Universidad universidadByID(Integer id);

}
