package operacoesBasicas.conjuntoConvidados;

import java.util.Objects;

public class Convidado {

	private String nome;
	private int codigoDoConvite;

	public Convidado(String nome, int codigoDoConvite) {
		super();
		this.nome = nome;
		this.codigoDoConvite = codigoDoConvite;
	}

	@Override
	public String toString() {
		return "Convidado " + nome + ", codigoDoConvite=" + codigoDoConvite;
	}

	public int getCodigoDoConvite() {
		return codigoDoConvite;
	}

	// hashCode() e equals() que não permite adicionar objetos do tipo Convidado
	// repetidos com base no codigoDoConvite
	@Override
	public int hashCode() {
		return Objects.hash(codigoDoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoDoConvite == other.codigoDoConvite;
	}

}

