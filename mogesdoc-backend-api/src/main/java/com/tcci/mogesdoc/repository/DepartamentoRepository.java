package com.tcci.mogesdoc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcci.mogesdoc.entity.Departamento;
import com.tcci.mogesdoc.entity.Pais;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{
	
	List<Departamento> findByPais(Pais pais);

}
