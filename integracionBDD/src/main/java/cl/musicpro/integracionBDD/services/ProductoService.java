package cl.musicpro.integracionBDD.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cl.musicpro.integracionBDD.model.DTO.CommonResponseDTO;
import cl.musicpro.integracionBDD.model.DTO.ProductoDTO;
import cl.musicpro.integracionBDD.model.Entities.ProductoEntities;
import cl.musicpro.integracionBDD.model.repository.ProductoRepository;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    @Autowired
    CategoriaService categoryService;

    public CommonResponseDTO getProducto(){

        CommonResponseDTO commonResponseDTO = new CommonResponseDTO();

        log.info("Request cl.musicpro.integracionBDD.service.ProductoService[getProductos]");

        List<ProductoDTO> listaProducto = new ArrayList<>();

        for(ProductoEntities producto : productoRepository.findAll()){
            ProductoDTO productoDTO = new ProductoDTO();

            productoDTO.setIdproducto(productoDTO.getIdproducto());
            productoDTO.setNombre(productoDTO.getNombre());
            productoDTO.setDescripcion(productoDTO.getDescripcion());
            productoDTO.setModelo(productoDTO.getModelo());
            productoDTO.setPrecio(productoDTO.getPrecio());
            productoDTO.setSku(productoDTO.getSku());

            productoDTO.setCategoria(categoryService.getCategoriaById(producto.getIdcategoria()));

            listaProducto.add(productoDTO);

        }

        commonResponseDTO.setResponseCode("200");
        commonResponseDTO.setResponseMessage("Ok");
        commonResponseDTO.setData(listaProducto);

        log.info("[getProducts] Response: " + commonResponseDTO.toString());
        return commonResponseDTO;
        }

        public ResponseEntity<CommonResponseDTO> addProducto(ProductoDTO productoDTO){
            ProductoEntities producto = new ProductoEntities();
        producto.setNombre(productoDTO.getNombre());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setModelo(productoDTO.getModelo());
        producto.setPrecio(productoDTO.getPrecio());
       producto.setSku(productoDTO.getSku());
       producto.setIdcategoria(productoDTO.getCategoria().getIdcategoria());

        ProductoEntities newProduct = productoRepository.save(producto);

        CommonResponseDTO commonResponseDTO = new CommonResponseDTO();
        commonResponseDTO.setResponseCode("200");
        commonResponseDTO.setResponseMessage("OK");
        commonResponseDTO.setData(newProduct);

        return new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.OK);
        }
}


