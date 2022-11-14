package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Documento;
import com.tcci.mogesdoc.service.DocumentoService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/documentos")
public class DocumentoController extends MogesdocControllerGeneric<Documento, DocumentoService>{

}
