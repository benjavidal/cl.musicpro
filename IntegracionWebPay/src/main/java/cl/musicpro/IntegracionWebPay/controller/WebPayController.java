package cl.musicpro.IntegracionWebPay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.musicpro.IntegracionWebPay.model.WebPayInitTransactionDTO;
import cl.musicpro.IntegracionWebPay.service.WebPayService;



    @RestController
    @RequestMapping("/webpay")
    public class WebPayController {

    @Autowired
    WebPayService webPayService;
    
    @PostMapping(path = "/transactions", produces = {"application/json"})
    public String createTransaction(@RequestHeader("Tbk-Api-Key-Id") String tbkApiKeyId,
                                    @RequestHeader("Tbk-Api-Key-Secret") String tbkApiKeySecret,
                                    @RequestBody WebPayInitTransactionDTO webPayInitTransactionDTO){
          return webPayService.createTransaction(tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);                              
                                    
    }

}
