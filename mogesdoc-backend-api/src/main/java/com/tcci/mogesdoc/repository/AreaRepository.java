package com.tcci.mogesdoc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcci.mogesdoc.entity.Area;
import com.tcci.mogesdoc.entity.Organizacion;

public interface AreaRepository extends JpaRepository<Area, Integer>{

	List<Area> findByOrganizacion(Organizacion organizacion);
	
}
