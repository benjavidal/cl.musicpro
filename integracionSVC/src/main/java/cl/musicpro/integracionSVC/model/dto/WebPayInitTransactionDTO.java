package cl.musicpro.integracionSVC.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WebPayInitTransactionDTO {
    @JsonProperty("buy_order")
    private String buyOrder;
    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("return_url")
    private String returnUrl;

}
