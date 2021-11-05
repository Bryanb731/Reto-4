package reto_4.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_4.reto.modelo.Message;

/**
 * 
 * @author Janus
 */
public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
    
}
