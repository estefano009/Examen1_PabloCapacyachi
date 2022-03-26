package com.example.idat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.idat.model.MallaCurricular;
import com.example.idat.repository.MallaCurricularRepository;
import com.example.idat.service.MallaCurricularService;


@Service
public class MallaServiceImpl implements MallaCurricularService {

	@Autowired
	private MallaCurricularRepository malla ;
	
	@Override
	public void guardarMalla(MallaCurricular mc) {
		// TODO Auto-generated method stub

		malla.save(mc);
	}

	@Override
	public void eliminarMalla(Integer id) {
		// TODO Auto-generated method stub
		malla.deleteById(id);
	}

	@Override
	public void editarMalla(MallaCurricular mc) {
		// TODO Auto-generated method stub
		malla.saveAndFlush(mc);
		
	}

	@Override
	public List<MallaCurricular> listarMalla() {
		// TODO Auto-generated method stub
		return malla.findAll();
	}

	@Override
	public MallaCurricular mallaById(Integer id) {
		// TODO Auto-generated method stub
		return malla.findById(id).orElse(null);
	}

}
