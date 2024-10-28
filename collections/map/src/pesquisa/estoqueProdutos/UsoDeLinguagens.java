package pesquisa.estoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class UsoDeLinguagens {
	protected Map<String, Integer> linguagens;

	public UsoDeLinguagens() {
		this.linguagens = new HashMap<String, Integer>();
	}

	protected void adicionarLinguagem(String linguagem, Integer utilizacao) {
		linguagens.put(linguagem, utilizacao);
	}

	protected void removerLinguagem(String linguagem) {
		linguagens.remove(linguagem);
	}

	protected void exibirContagemUsoLinguagens() {
		System.out.println(linguagens);
	}

	protected String encontrarLingugemMaisUsada() {
		String linguagemMaisFrequente = null;
	    int maiorFrequencia = 0;
	    for (Map.Entry<String, Integer> entry : linguagens.entrySet()) {
	      if (entry.getValue() > maiorFrequencia) {
	    	  maiorFrequencia = entry.getValue();
	        linguagemMaisFrequente = entry.getKey();
	      }
	    }
	    return linguagemMaisFrequente;
	}
	
	public static void main(String[] args) {
		UsoDeLinguagens linguagens = new UsoDeLinguagens();
		
		linguagens.adicionarLinguagem("java", 10);
		linguagens.adicionarLinguagem("python", 6);
		linguagens.adicionarLinguagem("javascript", 8);
		linguagens.adicionarLinguagem("c++", 5);
		linguagens.removerLinguagem("c++");
		linguagens.exibirContagemUsoLinguagens();
		System.out.println("A linguagem mais usada é " + linguagens.encontrarLingugemMaisUsada());
	}

}

