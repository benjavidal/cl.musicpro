package cl.musicpro.integracionBFF.model.DTO;

import lombok.Data;

@Data
public class CommonResponseDTO {
    private String responseCode;
    private String responseMessage;
    private Object Data;
    
}
