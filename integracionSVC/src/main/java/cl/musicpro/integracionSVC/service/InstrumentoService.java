package cl.musicpro.integracionSVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.integracionSVC.client.InstrumentoDbFeignClient;
import cl.musicpro.integracionSVC.model.dto.CommonResponseDTO;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class InstrumentoService {
    @Autowired
    InstrumentoDbFeignClient instrumentoDbFeignClient;

    public CommonResponseDTO getProductos(){
        log.info("Request cl.musicpro.integracionSVC.service[getProductos]");
        log.info("[getProductos] Response: "+instrumentoDbFeignClient.getProductos().toString());
        return instrumentoDbFeignClient.getProductos();
    }
    
}
