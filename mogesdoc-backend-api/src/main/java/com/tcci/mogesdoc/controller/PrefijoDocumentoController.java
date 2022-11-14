package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.PrefijoDocumento;
import com.tcci.mogesdoc.service.PrefijoDocumentoService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/prefijosDocumento")
public class PrefijoDocumentoController extends MogesdocControllerGeneric<PrefijoDocumento, PrefijoDocumentoService>{

}
