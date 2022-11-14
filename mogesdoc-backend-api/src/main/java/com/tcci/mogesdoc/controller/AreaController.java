package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Area;
import com.tcci.mogesdoc.service.AreaService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/areas")
public class AreaController extends MogesdocControllerGeneric<Area, AreaService>{

}
