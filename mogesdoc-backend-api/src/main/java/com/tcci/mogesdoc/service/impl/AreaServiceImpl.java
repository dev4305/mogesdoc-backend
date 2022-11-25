package com.tcci.mogesdoc.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.Area;
import com.tcci.mogesdoc.entity.Organizacion;
import com.tcci.mogesdoc.repository.AreaRepository;
import com.tcci.mogesdoc.service.AreaService;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;

@Service
public class AreaServiceImpl extends MogesdocServiceGenericImpl<Area, AreaRepository> implements AreaService{

	@Override
	public List<Area> findByOrganizacion(Organizacion organizacion) {
		return repository.findByOrganizacion(organizacion);
	}

}
