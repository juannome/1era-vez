package com.prueb.ejemplo.mode;

import org.springframework.data.repository.CrudRepository;
@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Prueba, Long> {
	 Prueba findByNombre(String nombre);
	
}
