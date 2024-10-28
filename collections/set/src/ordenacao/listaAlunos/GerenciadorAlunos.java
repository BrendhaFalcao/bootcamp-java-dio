package ordenacao.listaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	protected Set<Aluno> listaAlunos;

	protected GerenciadorAlunos() {

		this.listaAlunos = new HashSet<Aluno>();
	}

	protected void adicionarAluno(String nome, Long matricula, Double media) {
		this.listaAlunos.add(new Aluno(nome, matricula, media));
	}

	protected void removerAluno(long matricula) {
		if (!listaAlunos.isEmpty()) {
			for (Aluno a : listaAlunos) {
				if (a.getMatricula() == matricula) {
					listaAlunos.remove(a);
					break;
				}
			}
		} else {
			System.out.println("Lista vazia!");
		}
	}

	protected Set<Aluno> exibirAlunos() {
		return listaAlunos;
	}

	protected Set<Aluno> organizarAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
		return alunosPorNome;
	}

	protected Set<Aluno> organizarAlunosPorNota() {
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(listaAlunos);
		return alunosPorNota;
	}

	public static void main(String[] args) {
		GerenciadorAlunos listaDeAlunos = new GerenciadorAlunos();

		listaDeAlunos.adicionarAluno("João", 112233l, 7.5);
		listaDeAlunos.adicionarAluno("Pedro", 445566l, 9.0);
		listaDeAlunos.adicionarAluno("Maria", 778899l, 6.2);
		listaDeAlunos.adicionarAluno("Barbara", 23455l, 8.6);

		System.out.println(listaDeAlunos.exibirAlunos());
		System.out.println(listaDeAlunos.organizarAlunosPorNome());
		System.out.println(listaDeAlunos.organizarAlunosPorNota());

	}

}

