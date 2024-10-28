package operacoesBasicas.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	public Set<Convidado> listaDeConvidados;

	public ConjuntoConvidados() {
		this.listaDeConvidados = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		listaDeConvidados.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;

		if (!listaDeConvidados.isEmpty()) {
			for (Convidado c : listaDeConvidados) {
				if (c.getCodigoDoConvite() == codigoConvite) {
					convidadoParaRemover = c;
					break;
				} else {
					System.out.println("Código não existe!");
				}
			}
			listaDeConvidados.remove(convidadoParaRemover);
		} else {
			System.out.println("Lista vazia!");
		}
	}

	public int contarConvidados() {
		int quantidadeConvidados = listaDeConvidados.size();
		return quantidadeConvidados;
	}

	public void exibirConvidados() {
		if (!listaDeConvidados.isEmpty()) {
			System.out.println(listaDeConvidados);
		} else {
			System.out.println("Lista vazia!");
		}

	}

	public static void main(String[] args) {
		ConjuntoConvidados listaDeConvidados = new ConjuntoConvidados();
		listaDeConvidados.adicionarConvidado("Brendha", 1234);
		listaDeConvidados.adicionarConvidado("João", 1423);
		//não adiciona porque repete o código do convite
		listaDeConvidados.adicionarConvidado("Maria", 1234);
		listaDeConvidados.exibirConvidados();
		System.out.println(listaDeConvidados.contarConvidados());
		listaDeConvidados.removerConvidadoPorCodigoConvite(1234);
		listaDeConvidados.exibirConvidados();
	}

}
