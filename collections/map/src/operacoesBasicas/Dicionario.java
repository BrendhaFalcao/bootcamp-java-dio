package operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionario;

	public Dicionario() {
		this.dicionario = new HashMap<String, String>();
	}

	private void adicionarPalavra(String palavra, String definicao) {
		this.dicionario.put(palavra, definicao);
	}

	private void removerPalavra(String palavra) {
		this.dicionario.remove(palavra);
		System.out.println("Removendo a palavra " + palavra);
	}

	private Map<String, String> exibirPalavras() {
		return dicionario;
	}

	private String pesquisarPorPalavra(String palavra) {
		String definicao = null;

		if (dicionario.containsKey(palavra)) {
			definicao = dicionario.get(palavra);
		}
		return definicao;
	}

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();

		dicionario.adicionarPalavra("Alegria", "Sentimento");
		dicionario.adicionarPalavra("Cachorro", "Animal");
		dicionario.adicionarPalavra("Caderno", "Objeto");
		dicionario.adicionarPalavra("Margarida", "Flor");
		System.out.println(dicionario.exibirPalavras());
		System.out.println(dicionario.pesquisarPorPalavra("Cachorro"));
		System.out.println(dicionario.pesquisarPorPalavra("Margarida"));
		dicionario.removerPalavra("Cachorro");
		System.out.println(dicionario.exibirPalavras());

	}

}

