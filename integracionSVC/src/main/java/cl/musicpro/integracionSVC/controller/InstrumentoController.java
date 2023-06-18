package cl.musicpro.integracionSVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.musicpro.integracionSVC.service.InstrumentoService;

@RestController
@RequestMapping("/instrumentos-svc")
public class InstrumentoController {
    @Autowired
    InstrumentoService instrumentoService;
}
