package com.tcci.mogesdoc.service.impl;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.Organizacion;
import com.tcci.mogesdoc.repository.OrganizacionRepository;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;
import com.tcci.mogesdoc.service.OrganizacionService;

@Service
public class OrganizacionServiceImpl extends MogesdocServiceGenericImpl<Organizacion, OrganizacionRepository> implements OrganizacionService{

}
