package operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agenda;

	private AgendaContatos() {
		this.agenda = new HashMap<String, Integer>();
	}

	private void adicionarContato(String nome, Integer telefone) {
		this.agenda.put(nome, telefone);
	}

	private void removerContato(String nome) {
		this.agenda.remove(nome);
	}

	private Map<String, Integer> exibirContatos() {
		return agenda;
	}

	private Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (agenda.containsKey(nome)) {
			numeroPorNome = agenda.get(nome);
		}
		return numeroPorNome;
	}

	private void pesquisarPorNome2(String nome) {
		String nomePesquisado = null;
		if (agenda.containsKey(nome))
			nomePesquisado = nome;
			Integer numero = agenda.get(nomePesquisado);
			System.out.println("O numero do " + nome + " é " + numero);

	}

	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();

		agenda.adicionarContato("Maria", 22334455);
		agenda.adicionarContato("João", 33225577);
		agenda.adicionarContato("Pedro", 664773443);
		System.out.println(agenda.exibirContatos());
		System.out.println(agenda.pesquisarPorNome("Maria"));
		agenda.pesquisarPorNome2("João");
		agenda.removerContato("Pedro");
		System.out.println(agenda.exibirContatos());
		
	}

}

