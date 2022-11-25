package com.tcci.mogesdoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Departamento;
import com.tcci.mogesdoc.entity.Pais;
import com.tcci.mogesdoc.service.DepartamentoService;
import com.tcci.mogesdoc.service.PaisService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/departamentos")
public class DepartamentoController extends MogesdocControllerGeneric<Departamento, DepartamentoService>{
	
	@Autowired
	PaisService paisService;
	
	@GetMapping("/findByPais/{paisId}")
	public ResponseEntity<Iterable<Departamento>> findByPais(@PathVariable(name = "paisId",required = true) Integer paisId){
		Pais pais = paisService.findById(paisId).get();
		Iterable<Departamento> iterable = service.findByPais(pais);
		if(iterable.iterator().hasNext()) {
			return ResponseEntity.ok().body(iterable);
		} else {
			return ResponseEntity.noContent().build();
		}
	}

}
