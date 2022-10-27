package br.com.silvio.appmercado.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.silvio.appmercado.model.Lista;

public interface ListaRepo extends CrudRepository<Lista, Integer>{
	
}
