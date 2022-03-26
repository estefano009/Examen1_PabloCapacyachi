package com.example.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.idat.model.MallaCurricular;
import com.example.idat.service.MallaCurricularService;

@RestController
@RequestMapping("/malla")
public class MallaCurricularController {

	@Autowired
	private MallaCurricularService service;
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar")
	public ResponseEntity<List<MallaCurricular>>listar(){
		
		return new ResponseEntity<List<MallaCurricular>>(service.listarMalla(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/guardar")
	public ResponseEntity<Void> guardar(@RequestBody MallaCurricular malla){
		service.guardarMalla(malla);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
	public @ResponseBody ResponseEntity<MallaCurricular> buscarById(@PathVariable Integer id){
		MallaCurricular malla = service.mallaById(id);
		if(malla != null) {
			return new ResponseEntity<MallaCurricular>(malla, HttpStatus.OK);

		}
		return new ResponseEntity<MallaCurricular>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		MallaCurricular malla = service.mallaById(id);
		if(malla != null) {
			service.eliminarMalla(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/editar")
	public ResponseEntity<Void> editar(@RequestBody MallaCurricular malla){
		MallaCurricular malla2 = service.mallaById(malla.getIdMalla());
		if(malla2!= null) {
			service.editarMalla(malla);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
