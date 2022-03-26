package com.example.idat.service;

import java.util.List;

import com.example.idat.model.MallaCurricular;

public interface MallaCurricularService {

	
	public void guardarMalla(MallaCurricular mc);
	public void eliminarMalla(Integer id);
	public void editarMalla(MallaCurricular mc);
	public List<MallaCurricular> listarMalla();
	public MallaCurricular mallaById(Integer id);
}
