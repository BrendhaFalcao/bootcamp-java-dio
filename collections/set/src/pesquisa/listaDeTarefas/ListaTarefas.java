package pesquisa.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	// atributo
	protected Set<Tarefa> listaDeTarefas;

	protected ListaTarefas() {
		this.listaDeTarefas = new HashSet<>();
	}

	protected void adicionarTarefa(String descricao) {
		this.listaDeTarefas.add(new Tarefa(descricao));
	}

	protected void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if (!listaDeTarefas.isEmpty()) {
			for (Tarefa t : listaDeTarefas) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = t;
					break;
				}
			}
			listaDeTarefas.remove(tarefaParaRemover);
		} else {
			System.out.println("Lista de tarefas vazia!");
		}
	}

	protected void exibirTarefas() {
		if (!listaDeTarefas.isEmpty()) {
			System.out.println(listaDeTarefas);
		} else {
			System.out.println("Lista de tarefas vazia!");
		}
	}

	protected void contarTarefas() {
		if (!listaDeTarefas.isEmpty()) {
			System.out.println(listaDeTarefas.size());
		} else {
			System.out.println("Lista de tarefas vazia!");
		}
	}

	protected Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		if (!listaDeTarefas.isEmpty()) {
			for (Tarefa t : listaDeTarefas) {
				if (t.isConcluido()) {
					tarefasConcluidas.add(t);
				}
			}
		} else {
			System.out.println("Lista de tarefas vazia!");
		}
		return tarefasConcluidas;
	}

	protected Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		if (!listaDeTarefas.isEmpty()) {
			for (Tarefa t : listaDeTarefas) {
				if (t.isConcluido() == false) {
					tarefasPendentes.add(t);
				}
			}
		} else {
			System.out.println("Lista de tarefas vazia!");
		}
		return tarefasPendentes;
	}

	protected void marcarTarefaConcluida(String descricao) {
		if (!listaDeTarefas.isEmpty()) {

			for (Tarefa t : listaDeTarefas) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setConcluido(true);
				}
			}
		} else {
			System.out.println("Lista de tarefas vazia!");
		}
	}

	protected void marcarTarefaPendente(String descricao) {
		if (!listaDeTarefas.isEmpty()) {

			for (Tarefa t : listaDeTarefas) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setConcluido(false);
				}
			}
		} else {
			System.out.println("Lista de tarefas vazia!");
		}
	}

	protected void limparListaTarefas() {
		listaDeTarefas.clear();
	}

	public static void main(String[] args) {
		ListaTarefas listaDeTarefas = new ListaTarefas();

		// adicionando tarefas na lista
		listaDeTarefas.adicionarTarefa("Almoçar");
		listaDeTarefas.adicionarTarefa("Limpar casa");
		listaDeTarefas.adicionarTarefa("Fazer prova");

		// exibindo lista de tarefas
		listaDeTarefas.exibirTarefas();

		// contando quantidade de tarefas
		listaDeTarefas.contarTarefas();

		// marcando tarefas concluídas
		listaDeTarefas.marcarTarefaConcluida("Almoçar");
		listaDeTarefas.exibirTarefas();

		// mostrando tarefas concluídas
		System.out.println(listaDeTarefas.obterTarefasConcluidas());

		// mostrando tarefas pendentes
		System.out.println(listaDeTarefas.obterTarefasPendentes());

		listaDeTarefas.marcarTarefaPendente("Almoçar");
		listaDeTarefas.exibirTarefas();
		listaDeTarefas.limparListaTarefas();
		listaDeTarefas.exibirTarefas();

	}
}
