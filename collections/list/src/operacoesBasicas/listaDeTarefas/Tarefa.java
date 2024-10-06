package collections.list.src.operacoesBasicas.listaDeTarefas;

public class Tarefa {
	private String descricaoTarefa;

	//constructor de Tarefa
	public Tarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}

	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}

	@Override
	public String toString() {
		return descricaoTarefa;
	}
	
	
	
}
