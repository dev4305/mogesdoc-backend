package com.tcci.mogesdoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Area;
import com.tcci.mogesdoc.entity.Organizacion;
import com.tcci.mogesdoc.service.AreaService;
import com.tcci.mogesdoc.service.OrganizacionService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/areas")
public class AreaController extends MogesdocControllerGeneric<Area, AreaService>{

	@Autowired
	OrganizacionService organizacionService;
	
	@GetMapping("/findByOrganizacion/{organizacionId}")
	public ResponseEntity<Iterable<Area>> findByOrganizacion(@PathVariable(name = "organizacionId", required = true) Integer organizacionId){
		Organizacion organizacion = organizacionService.findById(organizacionId).get();
		Iterable<Area> iterable = service.findByOrganizacion(organizacion);
		if(iterable.iterator().hasNext()) {
			return ResponseEntity.ok().body(iterable);
		}else {
			return ResponseEntity.noContent().build();
		}
	}
	
}
