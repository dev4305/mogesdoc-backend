package com.tcci.mogesdoc.service.impl;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.Municipio;
import com.tcci.mogesdoc.repository.MunicipioRepository;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;
import com.tcci.mogesdoc.service.MunicipioService;

@Service
public class MunicipioServiceImpl extends MogesdocServiceGenericImpl<Municipio, MunicipioRepository> implements MunicipioService{

}
