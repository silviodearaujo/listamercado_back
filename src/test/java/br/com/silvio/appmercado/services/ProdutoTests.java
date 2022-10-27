package br.com.silvio.appmercado.services;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.silvio.appmercado.model.Produto;
import br.com.silvio.appmercado.repo.ProdutoRepo;
import br.com.silvio.appmercado.service.ProdutoServiceImpl;

@SpringBootTest
@ActiveProfiles("test")
public class ProdutoTests {
	
	@InjectMocks
	private ProdutoServiceImpl service;
	@Mock
	private ProdutoRepo repo;
	
	private Integer existingId = 1;
	private Integer nonExistingId = 100;
	private String keyword = "bolacha";
	private Produto newProduct;
	private Produto createdProduct;
	private ArrayList<Produto> listaDeVariosProdutos;
	
	@BeforeEach
	public void setup() throws Exception{
		newProduct = new Produto();
		newProduct.setNome("Bolacha");
		
		createdProduct = new Produto();
		createdProduct.setId(1);
		createdProduct.setNome("Bolacha");
		
		listaDeVariosProdutos = new ArrayList<Produto>();
		Produto p1,p2;
		p1=new Produto();
		p1.setId(2);
		p1.setNome("Bolacha recheada");
		p2 = new Produto();
		p2.setId(3);
		p2.setNome("Bolacha agua e sal");
		listaDeVariosProdutos.add(p1);
		listaDeVariosProdutos.add(p2);
		
		Mockito.when(repo.save(newProduct)).thenReturn(createdProduct);
		Mockito.when(repo.findById(existingId)).thenReturn(Optional.of(createdProduct));
		Mockito.when(repo.findById(nonExistingId)).thenReturn(null);
		Mockito.when(repo.findAllByNomeContaining("Biscoito")).thenReturn(new ArrayList<Produto>());
		Mockito.when(repo.findAllByNomeContaining(keyword)).thenReturn(listaDeVariosProdutos);
	}

	@Test
	public void deveriaCadastrarProduto() {

	}

	@Test
	public void deveriaRetornarPeloId() {

	}

	@Test
	public void deveriaNaoEncontrarId() {

	}
	
	@Test
	public void deveriaRetornarListaComPalavraChave() {
		
	}
	
	@Test
	public void deveriaRetornarListaVazia() {
		
	}

}
