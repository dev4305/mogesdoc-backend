package com.tcci.mogesdoc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



public class MogesdocServiceGenericImpl<E, R extends CrudRepository<E, Integer>> implements MogesdocSrvGeneric<E>{

	@Autowired
	protected R repository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public E save(E entity) {
		return repository.save(entity);
	}

	@Override
	public void update(E entity) {
		repository.save(entity);
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

}
