package reto_4.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_4.reto.modelo.Bike;

/**
 * 
 * @author Janus
 */
public interface BikeCrudRepository extends CrudRepository<Bike, Integer> {
    
}
