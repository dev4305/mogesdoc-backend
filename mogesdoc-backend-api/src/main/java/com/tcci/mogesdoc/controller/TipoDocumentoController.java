package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.TipoDocumento;
import com.tcci.mogesdoc.service.TipoDocumentoService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/tiposDocumento")
public class TipoDocumentoController extends MogesdocControllerGeneric<TipoDocumento, TipoDocumentoService>{

}
