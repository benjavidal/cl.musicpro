package cl.musicpro.integracionSVC.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="svc-product.db",url="")
public class InstrumentoDbFeignClient {
    
}
