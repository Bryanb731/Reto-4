package reto_4.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_4.reto.modelo.Client;

/**
 * 
 * @author Janus
 */
public interface ClientCrudRepository  extends CrudRepository<Client, Integer> {
    
}
