package cl.musicpro.integracionBFF.model.DTO;

import lombok.Data;

@Data
public class ProductoDTO {
    private int idproducto;
    private String nombre;
    private String modelo;
    private String descripcion;
    private String sku;
    private float precio;
    private CategoriaDTO categoria;
    
}
