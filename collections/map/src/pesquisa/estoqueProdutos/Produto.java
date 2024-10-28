package pesquisa.estoqueProdutos;

public class Produto {

	private String nome;
	private Integer quantidade;
	private Double preco;

	protected Produto(String nome, Integer quantidade, Double preco) {
		super();

		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}

}

