package com.example.idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Table(name="mallacurricular")
@Entity
public class MallaCurricular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private String año;
	
	
	@OneToOne
    @JoinColumn(name = "id_universidad", unique = true)
    private Universidad universidad;
	
	
	
	@OneToMany(mappedBy = "mallacurricular")
    List<Curso> curso = new ArrayList<>();



	public Integer getIdMalla() {
		return idMalla;
	}



	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}



	public String getAño() {
		return año;
	}



	public void setAño(String año) {
		this.año = año;
	}



	public Universidad getUniversidad() {
		return universidad;
	}



	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}



	public List<Curso> getCurso() {
		return curso;
	}



	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}


}
