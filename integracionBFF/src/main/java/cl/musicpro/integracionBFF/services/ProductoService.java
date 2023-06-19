package cl.musicpro.integracionBFF.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.integracionBFF.client.ProductoSvcFeingClient;
import cl.musicpro.integracionBFF.model.DTO.CommonResponseDTO;
import lombok.extern.log4j.Log4j2;


@Service
@Log4j2
public class ProductoService {
    @Autowired
    ProductoSvcFeingClient productoSvcFeingClient;

    public CommonResponseDTO getProductos(){
        log.info("Request cl.musicpro.bffserviceproduct.service[getProductos]");
        log.info("[getProductos] response" +productoSvcFeingClient.getProductos().toString());
        
        return productoSvcFeingClient.getProductos();
    }
    
    
}
