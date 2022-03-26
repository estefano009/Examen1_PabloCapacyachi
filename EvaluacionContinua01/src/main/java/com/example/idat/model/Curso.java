package com.example.idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Table(name="curso")
@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String curso;
	private String descripcion;
	
	
	@ManyToOne
    @JoinColumn(name = "id_malla")
    private MallaCurricular mallacurricular;
	
	@ManyToMany(mappedBy = "curso" , cascade = {CascadeType.PERSIST ,CascadeType.MERGE})
	private List<Profesor> profesor = new ArrayList<>();

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public MallaCurricular getMallacurricular() {
		return mallacurricular;
	}

	public void setMallacurricular(MallaCurricular mallacurricular) {
		this.mallacurricular = mallacurricular;
	}

	public List<Profesor> getProfesor() {
		return profesor;
	}

	public void setProfesor(List<Profesor> profesor) {
		this.profesor = profesor;
	}
	
	
	

}
