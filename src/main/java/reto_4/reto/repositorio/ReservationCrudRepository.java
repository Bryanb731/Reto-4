package reto_4.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_4.reto.modelo.Reservation;

/**
 * 
 * @author Janus
 */
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
    
}
