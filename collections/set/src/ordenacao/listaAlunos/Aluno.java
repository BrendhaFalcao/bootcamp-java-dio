package ordenacao.listaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private long matricula;
	private double nota;

	protected Aluno(String nome, long matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	@Override
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	public long getMatricula() {
		return matricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

}

class ComparatorPorNota implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getNota(), a2.getNota());
	}

}

