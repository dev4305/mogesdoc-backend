package com.tcci.mogesdoc.service;

import java.util.List;

import com.tcci.mogesdoc.entity.Area;
import com.tcci.mogesdoc.entity.Organizacion;

public interface AreaService extends MogesdocSrvGeneric<Area>{
	
	List<Area> findByOrganizacion(Organizacion organizacion);

}
