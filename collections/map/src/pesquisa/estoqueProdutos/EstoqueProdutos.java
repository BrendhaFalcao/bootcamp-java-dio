package pesquisa.estoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	protected Map<Long, Produto> estoqueDeProdutos;

	protected EstoqueProdutos() {
		this.estoqueDeProdutos = new HashMap<>();
	}

	protected void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
		estoqueDeProdutos.put(codigo, new Produto(nome, quantidade, preco));
	}

	protected void exibirProdutos() {
		System.out.println(estoqueDeProdutos);
	}

	protected double calcularValorTotalEstoque() {
		double somaTotalEstoque = 0;
		for (Produto p : estoqueDeProdutos.values()) {
			somaTotalEstoque += (p.getQuantidade() * p.getPreco());
		}
		return somaTotalEstoque;
	}

	protected void obterProdutoMaisCaro() {
		String produtoMaisCaro = null;
		double valor = 0;
		for (Produto p : estoqueDeProdutos.values()) {
			if (valor < p.getPreco()) {
				valor = p.getPreco();
				produtoMaisCaro = p.getNome();
			}
		}
		System.out.println("O produto mais caro é " + produtoMaisCaro);
	}

	protected void obterProdutoMaisBarato() {
		String produtoMaisBarato = null;
		double valor = Double.MAX_VALUE;
		for (Produto p : estoqueDeProdutos.values()) {
			if (valor > p.getPreco()) {
				valor = p.getPreco();
				produtoMaisBarato = p.getNome();
			}
		}
		System.out.println("O produto mais caro é " + produtoMaisBarato);
	}

	protected void obterProdutoMaiorQuantidadeValor() {
		String produtoMaiorQuantidadevalor = null;
		double valor = 0;
		for (Produto p : estoqueDeProdutos.values()) {
			if (valor < (p.getQuantidade() * p.getPreco())) {
				valor = p.getQuantidade() * p.getPreco();
				produtoMaiorQuantidadevalor = p.getNome();
			}
		}

		System.out.println("O produto com maior valor por quantidade é " + produtoMaiorQuantidadevalor);
	}

	public static void main(String[] args) {
		EstoqueProdutos estoqueDeProdutos = new EstoqueProdutos();

		estoqueDeProdutos.adicionarProduto(123, "batata", 2, 2.50);
		estoqueDeProdutos.adicionarProduto(234, "tomate", 2, 5.00);
		estoqueDeProdutos.adicionarProduto(567, "biscoito", 3, 3.00);
		estoqueDeProdutos.adicionarProduto(567, "cebola", 5, 3.50);

		estoqueDeProdutos.exibirProdutos();
		System.out.println(estoqueDeProdutos.calcularValorTotalEstoque());
		estoqueDeProdutos.obterProdutoMaisCaro();
		estoqueDeProdutos.obterProdutoMaisBarato();
		estoqueDeProdutos.obterProdutoMaiorQuantidadeValor();

	}

}

