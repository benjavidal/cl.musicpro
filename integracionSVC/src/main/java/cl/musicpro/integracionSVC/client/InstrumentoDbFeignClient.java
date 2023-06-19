package cl.musicpro.integracionSVC.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;

import cl.musicpro.integracionSVC.model.dto.CommonResponseDTO;

@FeignClient(name="svc-product.db",url="")
public interface InstrumentoDbFeignClient {
    @GetMapping(path = "/productos" , produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getProductos();
    
}
