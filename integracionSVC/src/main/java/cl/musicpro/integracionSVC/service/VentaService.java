package cl.musicpro.integracionSVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.integracionSVC.client.WebpayAmbFeignClient;
import cl.musicpro.integracionSVC.model.dto.WebPayInitTransactionDTO;

@Service
public class VentaService {
    @Autowired
    WebpayAmbFeignClient webpayAmbFeignClient;

    public String generarVenta(WebPayInitTransactionDTO webPayInitTransactionDTO){
        String tbkApiKeyId = "597055555532";
        String tbkApiKeySecret = "57988532A7440BB0C9079DED94D31EA1615BACEB56610332264630D42D0A36B1C";

        String resultado = webpayAmbFeignClient.createTransaction (tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);
        return resultado; 
    }
    
}
