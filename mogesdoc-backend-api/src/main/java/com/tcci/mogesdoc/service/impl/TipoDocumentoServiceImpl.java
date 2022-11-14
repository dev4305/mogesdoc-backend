package com.tcci.mogesdoc.service.impl;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.TipoDocumento;
import com.tcci.mogesdoc.repository.TipoDocumentoRepository;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;
import com.tcci.mogesdoc.service.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImpl extends MogesdocServiceGenericImpl<TipoDocumento, TipoDocumentoRepository> implements TipoDocumentoService{

}
