package br.com.silvio.appmercado.service;

import java.util.List;

import br.com.silvio.appmercado.model.Produto;

public interface IProdutoService {
	
	public Produto criarNovoProduto(Produto prod);
	public Produto alterarProduto(Produto prod);
	public List<Produto> listarTodos();
	public List<Produto> buscarPorPalavraChave(String key);

}