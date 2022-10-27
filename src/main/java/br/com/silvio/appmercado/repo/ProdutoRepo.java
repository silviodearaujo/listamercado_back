package br.com.silvio.appmercado.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.silvio.appmercado.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{

	List<Produto> findAllByNomeContaining(String key);

}
