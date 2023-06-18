package cl.musicpro.integracionBFF.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import cl.musicpro.integracionBFF.model.DTO.CommonResponseDTO;

@FeignClient (name = "bff-producto-svc",url= "http://localhost:8181/producto-svc")
public interface ProductoSvcFeingClient {

    @GetMapping(path = "/productos",produces = MediaType.APPLICATION_JSON_VALUE)

    public CommonResponseDTO getProductos();
    
}
