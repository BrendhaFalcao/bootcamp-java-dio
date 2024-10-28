package pesquisa.listaDeTarefas;

public class Tarefa {
	
	private String descricao;
	private boolean concluido = false;

	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	@Override
	public String toString() {
		return "Tarefa = " + descricao + " (concluído = " + concluido + ")" ;
	}

	 
	
}

