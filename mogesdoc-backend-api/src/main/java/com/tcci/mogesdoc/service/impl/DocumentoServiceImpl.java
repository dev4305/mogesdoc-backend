package com.tcci.mogesdoc.service.impl;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.Documento;
import com.tcci.mogesdoc.repository.DocumentoRepository;
import com.tcci.mogesdoc.service.DocumentoService;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;

@Service
public class DocumentoServiceImpl extends MogesdocServiceGenericImpl<Documento, DocumentoRepository> implements DocumentoService{

}
