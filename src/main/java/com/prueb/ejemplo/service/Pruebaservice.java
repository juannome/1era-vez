package com.prueb.ejemplo.service;
import java.util.List;
import com.prueb.ejemplo.mode.Prueba;


public interface Pruebaservice {
		Prueba guarDatos(Prueba datos_prueba);

		Prueba findById(Long id);

	    List<Prueba> findAll();

	    void deleteById(Long id);

	    Prueba editPrueba(Prueba datos_prueba);
}
