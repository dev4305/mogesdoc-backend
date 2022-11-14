package com.tcci.mogesdoc.service;

import java.util.Optional;

public interface MogesdocSrvGeneric<E> {

	public Iterable<E> findAll();
	public Optional<E> findById(Integer id);
	public E save(E entity);
	public void update(E entity);
	public void deleteById(Integer id);
	
}
