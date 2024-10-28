package ordenacao.cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	
	protected Set<Produto> listaProdutosCadastrados;

	protected CadastroProduto() {
		this.listaProdutosCadastrados = new HashSet<Produto>();
	}
	
	protected void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		this.listaProdutosCadastrados.add(new Produto(nome, cod, preco, quantidade));
	}
	
	protected Set<Produto> exibirProdutosCadastrados(){
		return listaProdutosCadastrados;
		
	}
	
	protected Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(listaProdutosCadastrados);
		return produtosPorNome;
	}
	
	protected Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(listaProdutosCadastrados);
		return produtosPorPreco;
	}
	
	
	public static void main(String[] args) {
		CadastroProduto listaDeProdutosCadastrados = new CadastroProduto();
		
		listaDeProdutosCadastrados.adicionarProduto(123, "pão", 2.50, 3);
		listaDeProdutosCadastrados.adicionarProduto(456, "ovo", 8.50, 10);
		listaDeProdutosCadastrados.adicionarProduto(789, "mamão", 3.50, 2);
		System.out.println(listaDeProdutosCadastrados.exibirProdutosCadastrados());
		System.out.println(listaDeProdutosCadastrados.exibirProdutosPorNome());
		System.out.println(listaDeProdutosCadastrados.exibirProdutosPorPreco());
		
	}
	
}

