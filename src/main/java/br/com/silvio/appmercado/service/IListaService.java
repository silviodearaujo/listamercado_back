package br.com.silvio.appmercado.service;

import br.com.silvio.appmercado.model.ItemLista;
import br.com.silvio.appmercado.model.Lista;

public interface IListaService {
	
	public Lista criarNovaLista(Lista nova);
	public void removerLista(Integer id);
	public void fecharLista(Integer id);
	public void buscarPeloId(Integer id);
	
}
