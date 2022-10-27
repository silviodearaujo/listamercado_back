package br.com.silvio.appmercado.service;

import br.com.silvio.appmercado.model.ItemLista;

public interface IItemListaService {
	public ItemLista inserirItem(ItemLista novo);
	public ItemLista alterarItem(ItemLista item);
	public void      removerItem(Integer numSeq);
}
