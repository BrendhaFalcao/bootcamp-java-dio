package collections.list.src.operacoesBasicas.carrinhoDeCompras;

public class Item {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Item(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}



	@Override
	public String toString() {
		return nome + ", "+preco+ ", " + quantidade;
	}

}
