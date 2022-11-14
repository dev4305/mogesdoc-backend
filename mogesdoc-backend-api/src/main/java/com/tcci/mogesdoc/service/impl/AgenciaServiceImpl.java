package com.tcci.mogesdoc.service.impl;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.Agencia;
import com.tcci.mogesdoc.repository.AgenciaRepository;
import com.tcci.mogesdoc.service.AgenciaService;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;

@Service
public class AgenciaServiceImpl extends MogesdocServiceGenericImpl<Agencia, AgenciaRepository> implements AgenciaService{

}
