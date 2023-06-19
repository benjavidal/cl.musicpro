package cl.musicpro.integracionBFF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.musicpro.integracionBFF.model.DTO.CommonResponseDTO;
import cl.musicpro.integracionBFF.services.ProductoService;

@RestController
@RequestMapping("/producto-bff")
public class ProductoController {

    @Autowired
    ProductoService ProductoService;

    @GetMapping(path ="/producto" , produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getProductos(){
        return ProductoService.getProductos();
    }
    
}
