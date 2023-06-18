package cl.musicpro.IntegracionWebPay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.IntegracionWebPay.client.WebpayFeignClient;
import cl.musicpro.IntegracionWebPay.model.WebPayInitTransactionDTO;

@Service
public class WebPayService {

    @Autowired
    WebpayFeignClient webPayFeignClient;

    public String createTransaction(String tbkApiKeyId,
                                    String tbkApiKeySecret,
                                    WebPayInitTransactionDTO webPayInitTransactionDTO){
        return webPayFeignClient.createTransaction(tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);                            
    }
    
}
