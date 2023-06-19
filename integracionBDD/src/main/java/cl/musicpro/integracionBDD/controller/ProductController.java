package cl.musicpro.integracionBDD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import lombok.extern.log4j.Log4j2;
import cl.musicpro.integracionBDD.model.DTO.CommonResponseDTO;
import cl.musicpro.integracionBDD.model.DTO.ProductoDTO;
import cl.musicpro.integracionBDD.services.ProductoService;

@Log4j2
@RestController
@RequestMapping("/products-db")
public class ProductController {
    @Autowired
    ProductoService productoService;

    @GetMapping(path = "/producto", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getAll(){
        log.info("cl.musicpro.integracionBDD.controller Request:[getAll]");
        return productoService.getProducto();

    }

    @PostMapping(path = "/producto", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO>addProducto(@RequestBody ProductoDTO productoDTO){
        log.info("[addProduct]Request: "+productoDTO.toString());
        return productoService.addProducto(productoDTO);
    }
    
}
