package com.tcci.mogesdoc.service;

import java.util.List;

import com.tcci.mogesdoc.entity.Departamento;
import com.tcci.mogesdoc.entity.Pais;

public interface DepartamentoService extends MogesdocSrvGeneric<Departamento>{
	
	List<Departamento> findByPais(Pais pais);

}
