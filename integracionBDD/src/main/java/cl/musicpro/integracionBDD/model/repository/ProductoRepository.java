package cl.musicpro.integracionBDD.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.musicpro.integracionBDD.model.Entities.ProductoEntities;



public interface ProductoRepository extends JpaRepository<ProductoEntities,Integer>{

}
    
