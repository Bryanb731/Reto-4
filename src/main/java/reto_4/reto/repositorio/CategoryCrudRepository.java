package reto_4.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_4.reto.modelo.Category;

/**
 * 
 * @author Janus
 */
public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
    
}
