package collections.list.src.operacoesBasicas.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

	// atributo que será a lista
	// lista criada com generics type
	private List<Tarefa> listaDeTarefas;

	// construtor de ListaDeTarefas
	// cria um ArrayList vazio
	public ListaDeTarefas() {
		this.listaDeTarefas = new ArrayList<>();
	}

	//adiciona Tarefa na listaDeTarefas
	public void adicionarTarefa(String descricaoTarefa) {
		listaDeTarefas.add(new Tarefa(descricaoTarefa));
	}
	
	//adiciona a tarefa que deseja remover a uma lista e depois
	//remove da lista de tarefas todas as tarefas que deseja remover
	public void removerTarefa(String descricaoTarefa) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : listaDeTarefas) {
			if(t.getDescricaoTarefa().equalsIgnoreCase(descricaoTarefa)) {
				tarefasParaRemover.add(t);
			}
		}
	listaDeTarefas.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalDeTarefas() {
		return listaDeTarefas.size();
		
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(listaDeTarefas);
	}
	

	public static void main(String[] args) {
		
		ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
		listaDeTarefas.adicionarTarefa("Tarefa 1");
		listaDeTarefas.adicionarTarefa("Tarefa 2");
		//listaDeTarefas.removerTarefa("Tarefa 1");
		System.out.println(listaDeTarefas.obterNumeroTotalDeTarefas());
		listaDeTarefas.obterDescricoesTarefas();
		 
	}


}

