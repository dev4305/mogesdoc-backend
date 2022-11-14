package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Organizacion;
import com.tcci.mogesdoc.service.OrganizacionService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/organizaciones")
public class OrganizacionController extends MogesdocControllerGeneric<Organizacion, OrganizacionService>{

}
