package com.tcci.mogesdoc.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.Departamento;
import com.tcci.mogesdoc.entity.Pais;
import com.tcci.mogesdoc.repository.DepartamentoRepository;
import com.tcci.mogesdoc.service.DepartamentoService;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;

@Service
public class DepartamentoServiceImpl extends MogesdocServiceGenericImpl<Departamento, DepartamentoRepository> implements DepartamentoService{

	@Override
	public List<Departamento> findByPais(Pais pais) {
		return repository.findByPais(pais);
	}

}
