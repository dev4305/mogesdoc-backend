package com.tcci.mogesdoc.service.impl;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.Pais;
import com.tcci.mogesdoc.repository.PaisRepository;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;
import com.tcci.mogesdoc.service.PaisService;

@Service
public class PaisServiceImpl extends MogesdocServiceGenericImpl<Pais, PaisRepository> implements PaisService{

}
