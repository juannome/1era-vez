package com.prueb.ejemplo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueb.ejemplo.mode.Prueba;
import com.prueb.ejemplo.mode.Repository;

@Service
public class PruebaServiceImpl  implements Pruebaservice{
	@Autowired
	private Repository datos_repository;
	@Override
	public Prueba guarDatos(Prueba datos_prueba) {
		
		return datos_repository.save(datos_prueba);
	}

	@Override
	public Prueba findById(Long id) {
		 Optional<Prueba> datos_prueba = datos_repository.findById(id);
	        if(datos_prueba.isPresent()){
	            return datos_prueba.get();
	        }
	        return new Prueba();
	    }

	@Override
	public List<Prueba> findAll() {
		
		return (List<Prueba>)datos_repository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		datos_repository.deleteById(id);
		
	}

	@Override
	public Prueba editPrueba(Prueba datos_prueba) {
		
		return datos_repository.save(datos_prueba);
	}

}
