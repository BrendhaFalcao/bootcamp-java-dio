package collections.list.src.ordenacao.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

	public List<Integer> listaDeNumeros;

	public OrdenacaoNumeros() {
		this.listaDeNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		listaDeNumeros.add(numero);
	}

	public List<Integer> ordenarAscendente() {
		List<Integer> numerosOrdemAscendente = new ArrayList<>(listaDeNumeros);
		Collections.sort(numerosOrdemAscendente);
		return numerosOrdemAscendente;
	}

	public List<Integer> ordenarDescendente() {
		List<Integer> numerosOrdemDescendente = new ArrayList<>(listaDeNumeros);
		Collections.sort(numerosOrdemDescendente, Comparator.reverseOrder());
		return numerosOrdemDescendente;

	}

	public static void main(String[] args) {
		OrdenacaoNumeros listaDeNumeros = new OrdenacaoNumeros();
		
		listaDeNumeros.adicionarNumero(10);
		listaDeNumeros.adicionarNumero(2);
		listaDeNumeros.adicionarNumero(6);
		listaDeNumeros.adicionarNumero(17);
		System.out.println(listaDeNumeros.ordenarAscendente());
		System.out.println(listaDeNumeros.ordenarDescendente());
	}
	
}

