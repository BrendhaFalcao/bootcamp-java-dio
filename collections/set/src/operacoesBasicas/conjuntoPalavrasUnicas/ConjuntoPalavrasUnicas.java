package operacoesBasicas.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	public Set<String> conjuntoDePalavras;

	// Construtor da classe ConjutnoPalavrasUnicas
	public ConjuntoPalavrasUnicas() {
		this.conjuntoDePalavras = new HashSet<String>();
	}

	public void adicionarPalavra(String palavra) {
		this.conjuntoDePalavras.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if (!conjuntoDePalavras.isEmpty()) {
			if (conjuntoDePalavras.contains(palavra)) {
				conjuntoDePalavras.remove(palavra);
			} else {
				System.out.println("Palavra não existe no conjunto");
			}
		} else {
			System.out.println("Conjunto está vazio");
		}
	}

	public void verificarPalavra(String palavra) {

		if (conjuntoDePalavras.contains(palavra) == true) {
			System.out.println("A palavra " + palavra + " existe no conjunto.");
		} else {
			System.out.println("A palavra " + palavra + " NÃO existe no conjunto.");

		}

	}

	public void exibirPalavrasUnicas() {
		if (!conjuntoDePalavras.isEmpty()) {
			System.out.println(conjuntoDePalavras);
		} else {
			System.out.println("Conjunto vazio!");
		}

	}

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoDePalavras = new ConjuntoPalavrasUnicas();

		conjuntoDePalavras.adicionarPalavra("Mouse");
		conjuntoDePalavras.adicionarPalavra("Teclado");
		conjuntoDePalavras.adicionarPalavra("Monitor");
		conjuntoDePalavras.adicionarPalavra("Mouse");
		conjuntoDePalavras.removerPalavra("mouse");
		conjuntoDePalavras.exibirPalavrasUnicas();
		conjuntoDePalavras.verificarPalavra("Mouse");

	}

}

