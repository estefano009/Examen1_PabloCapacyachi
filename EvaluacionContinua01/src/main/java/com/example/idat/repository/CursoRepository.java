package com.example.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.idat.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
