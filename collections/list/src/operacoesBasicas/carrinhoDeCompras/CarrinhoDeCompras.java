package collections.list.src.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	// atributo que é a lista de fato
	private List<Item> carrinho;

	// construtor da classe CarrinhoDeCompras
	public CarrinhoDeCompras() {
		carrinho = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		//carrinho.add(new Item(nome, preco, quantidade));
		Item item = new Item(nome, preco, quantidade);
		carrinho.add(item);
	}

	public void exibirItens() {
		System.out.println(carrinho);
	}
	
	//TODO: método que calcula o valor total de itens no carrinho
	public double calcularValorTotal() {
		double valorTotal = 0;
		for(Item item : carrinho) {
			double valorItem = item.getPreco() * item.getQuantidade();
			valorTotal += valorItem;
		}
		
		return valorTotal;
	}
	
	//TODO: método que remove itens do carrinho
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item item : carrinho) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(item);
			}
		}
	carrinho.removeAll(itensParaRemover);
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.adicionarItem("Banana", 2.50, 2);
		carrinhoDeCompras.adicionarItem("Morango", 3.40, 3);
		carrinhoDeCompras.exibirItens();
		System.out.println(carrinhoDeCompras.calcularValorTotal());
		carrinhoDeCompras.removerItem("Morango");
		carrinhoDeCompras.exibirItens();

	}

}

