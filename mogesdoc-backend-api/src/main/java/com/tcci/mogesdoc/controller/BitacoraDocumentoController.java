package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.BitacoraDocumento;
import com.tcci.mogesdoc.service.BitacoraDocumentoService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/bitacorasDocumento")
public class BitacoraDocumentoController extends MogesdocControllerGeneric<BitacoraDocumento, BitacoraDocumentoService>{

}
