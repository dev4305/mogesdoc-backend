package com.tcci.mogesdoc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcci.mogesdoc.service.MogesdocSrvGeneric;

public class MogesdocControllerGeneric <E, S extends MogesdocSrvGeneric<E>>{

	@Autowired
	protected S service;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		Iterable<?> iterableService = service.findAll();
		if(iterableService.iterator().hasNext()) {
			return ResponseEntity.ok().body(iterableService);
		} else {
			return ResponseEntity.noContent().build();
		}
	}
	
	@GetMapping("/id")
	public ResponseEntity<?> getById(@PathVariable("id") Integer id){
		Optional<?> element = service.findById(id);
		if(element.isPresent()) {
			return ResponseEntity.ok().body(service.findById(id));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody E entity){
		try {
			E entityData = service.save(entity);
			return ResponseEntity.status(HttpStatus.CREATED).body(entityData);
		}catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody E entity){
		try {
			service.update(entity);
			return ResponseEntity.status(HttpStatus.OK).body(entity);
		}catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable Integer id){
		try {
			Optional<?> element = service.findById(id);
			if(element.isPresent()) {
				service.deleteById(id);
				return ResponseEntity.noContent().build();
			}else {
				return ResponseEntity.badRequest().build();
			}
		}catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
}
