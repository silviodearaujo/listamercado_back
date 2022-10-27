package br.com.silvio.appmercado.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.silvio.appmercado.model.ItemLista;
import br.com.silvio.appmercado.model.Produto;

public interface ItemListaRepo extends CrudRepository<ItemLista, Integer>{
	public List<Produto> findAllByNomeContaining(String palavraChave);
}
