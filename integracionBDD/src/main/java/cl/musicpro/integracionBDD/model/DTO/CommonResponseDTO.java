package cl.musicpro.integracionBDD.model.DTO;

import lombok.Data;

@Data

public class CommonResponseDTO {
    private String responseCode;
    private String responseMessage;
    private Object data;
}
