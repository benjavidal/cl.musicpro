package cl.musicpro.integracionBDD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.integracionBDD.model.DTO.CategoriaDTO;
import cl.musicpro.integracionBDD.model.Entities.CategoriaEntities;
import cl.musicpro.integracionBDD.model.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public CategoriaDTO getCategoryById (int idcategoria){
        CategoriaEntities  categoria = CategoriaEntities.getIdcategoria(idcategoria)

        CategoriaDTO categoriaDTO = new CategoriaDTO();
        categoriaDTO.setIdcategoria(categoria.getIdcategoria());
        categoriaDTO.setNombre(categoria.getNombre());

    }
    
}
