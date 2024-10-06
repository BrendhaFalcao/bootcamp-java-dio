package collections.list.src.pesquisa.somaDeNumero;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	public List<Integer> listaDeNumeros;

	// Construtor para inicializar a lista de números
	public SomaNumeros() {
		this.listaDeNumeros = new ArrayList<>();
	}

	// Método para adicionar um número à lista
	public void adicionarNumero(int numero) {
		listaDeNumeros.add(numero);
	}

	// Método para calcular a soma de todos os números da lista
	public int calcularSoma() {
		int total = 0;

		if (!listaDeNumeros.isEmpty()) {
			for (int n : listaDeNumeros) {
				total += n;
			}
		}
		return total;
	}

	// Método para encontrar o maior número na lista
	public int encontrarMaiorNumero() {
		int maiorNumero = listaDeNumeros.get(0);
		if (!listaDeNumeros.isEmpty()) {
			for (int n : listaDeNumeros) {
				if (n > maiorNumero) {
					maiorNumero = n;
				}
			}
		}
		return maiorNumero;
	}

	// Método para encontrar o menor número na lista
	public int encontrarMenorNumero() {
		int menorNumero = listaDeNumeros.get(0);
		if (!listaDeNumeros.isEmpty()) {
			for (int n : listaDeNumeros) {
				if (n < menorNumero) {
					menorNumero = n;
				}
			}
		}
		return menorNumero;
	}

	// Método para exibir todos os números da lista
	public List<Integer> exibirNumeros() {
		return listaDeNumeros;
	}

	//Método que mostra o número que está em uma posição específica
	public int getPosition(int n) {
		int numeroPosition = listaDeNumeros.get(n);
		return numeroPosition;
	}

	public static void main(String[] args) {
		SomaNumeros listaDeNumeros = new SomaNumeros();

		listaDeNumeros.adicionarNumero(2);
		listaDeNumeros.adicionarNumero(7);
		listaDeNumeros.adicionarNumero(3);
		listaDeNumeros.adicionarNumero(5);
		System.out.println(listaDeNumeros.exibirNumeros());
		System.out.println(listaDeNumeros.calcularSoma());
		System.out.println(listaDeNumeros.encontrarMaiorNumero());
		System.out.println(listaDeNumeros.encontrarMenorNumero());
		System.out.println(listaDeNumeros.getPosition(0));
	}

}

