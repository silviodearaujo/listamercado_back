package br.com.silvio.appmercado.service;

import java.util.List;

import br.com.silvio.appmercado.model.Lista;

public interface IListaService {
	public Lista criarNovaLista(Lista nova);
	public void  removerLista(Integer id);
	public Lista  fecharLista(Integer id);
	public Lista  buscarPeloId(Integer id);	
	public List<Lista> buscarTodas();
}