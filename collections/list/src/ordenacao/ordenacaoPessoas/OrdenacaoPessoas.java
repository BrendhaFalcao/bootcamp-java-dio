package collections.list.src.ordenacao.ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	public List<Pessoa> listaDePessoas;

	// construtor da classe
	public OrdenacaoPessoas() {
		this.listaDePessoas = new ArrayList<>();
	}

	// método que adiciona uma pessoa na lista
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaDePessoas.add(new Pessoa(nome, idade, altura));
	}

	// método que mostra o conteúdo da lista
	public List<Pessoa> mostrarListaPessoas() {
		return listaDePessoas;
	}

	// método que ordena o objeto Pessoa por idade
	// usando comparable
	public List<Pessoa> ordenarPorIdade() {
		// Faz uma cópia da listaDePessoas
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);

		if (!listaDePessoas.isEmpty()) {
			// Só é possível utilizar o método Collection.sort() pois o comparable
			// foi configurado no compareTo() na classe Pessoa
			Collections.sort(pessoasPorIdade);
			return pessoasPorIdade;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}

	}

	// método que ordena o objeto Pessoa por altura
	// usando comparator
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
		
	    if (!listaDePessoas.isEmpty()) {
	        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
	        return pessoasPorAltura;
	      } else {
	        throw new RuntimeException("A lista está vazia!");
	      }
	}

	public static void main(String[] args) {
		OrdenacaoPessoas listaDePessoas = new OrdenacaoPessoas();

		listaDePessoas.adicionarPessoa("Brendha", 26, 1.56);
		listaDePessoas.adicionarPessoa("João", 17, 1.65);
		listaDePessoas.adicionarPessoa("Maria", 32, 1.61);
		System.out.println(listaDePessoas.mostrarListaPessoas());
		System.out.println(listaDePessoas.ordenarPorIdade());
		System.out.println(listaDePessoas.ordenarPorAltura());
	}
}

