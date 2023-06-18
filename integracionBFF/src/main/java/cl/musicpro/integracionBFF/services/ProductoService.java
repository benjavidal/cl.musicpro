package cl.musicpro.integracionBFF.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.integracionBFF.client.ProductoSvcFeingClient;
import cl.musicpro.integracionBFF.model.DTO.CommonResponseDTO;

@Service
public class ProductoService {
    @Autowired
    ProductoSvcFeingClient productoSvcFeingClient;

    public CommonResponseDTO getProductos(){
        return productoSvcFeingClient.getProductos();
    }
    
    
}
