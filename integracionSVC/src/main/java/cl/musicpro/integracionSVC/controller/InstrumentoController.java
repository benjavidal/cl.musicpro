package cl.musicpro.integracionSVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.musicpro.integracionSVC.model.dto.CommonResponseDTO;
import cl.musicpro.integracionSVC.service.InstrumentoService;

@RestController
@RequestMapping("/instrumentos-svc")
public class InstrumentoController {
    @Autowired
    InstrumentoService instrumentoService;

    @GetMapping(path="/productos", produces= MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getProductos (){
        return instrumentoService.getProductos();
    }
}
