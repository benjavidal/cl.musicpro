package cl.musicpro.integracionBDD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.integracionBDD.model.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productRepository;
    @Autowired
    CategoriaService categoryService;

}
