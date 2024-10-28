package ordenacao.livrariaOnline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
	protected Map<String, Livro> livros;

	public LivrariaOnline() {
		this.livros = new HashMap<String, Livro>();
	}

	protected void adicionarLivro(String link, String titulo, String autor, double preco) {
		livros.put(link, new Livro(titulo, autor, preco));
	}

	protected void removerLivro(String titulo) {
		livros.remove(titulo);
	}

	protected Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

		Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

		Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

		for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
			livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
		}
		return livrosOrdenadosPorPreco;
	}

	protected Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

		Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

		Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

		for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
			livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
		}

		return livrosOrdenadosPorAutor;
	}

	public List<Livro> obterLivroMaisCaro() {
		List<Livro> livrosMaisCaros = new ArrayList<>();
		double precoMaisAlto = Double.MIN_VALUE;

		if (!livros.isEmpty()) {
			for (Livro livro : livros.values()) {
				if (livro.getPreco() > precoMaisAlto) {
					precoMaisAlto = livro.getPreco();
				}
			}
		} else {
			throw new NoSuchElementException("A livraria está vazia!");
		}

		for (Map.Entry<String, Livro> entry : livros.entrySet()) {
			if (entry.getValue().getPreco() == precoMaisAlto) {
				Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
				livrosMaisCaros.add(livroComPrecoMaisAlto);
			}
		}
		return livrosMaisCaros;
	}

	public List<Livro> obterLivroMaisBarato() {
		List<Livro> livrosMaisBaratos = new ArrayList<>();
		double precoMaisBaixo = Double.MAX_VALUE;

		if (!livros.isEmpty()) {
			for (Livro livro : livros.values()) {
				if (livro.getPreco() < precoMaisBaixo) {
					precoMaisBaixo = livro.getPreco();
				}
			}
		} else {
			throw new NoSuchElementException("A livraria está vazia!");
		}

		for (Map.Entry<String, Livro> entry : livros.entrySet()) {
			if (entry.getValue().getPreco() == precoMaisBaixo) {
				Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
				livrosMaisBaratos.add(livroComPrecoMaisBaixo);
			}
		}
		return livrosMaisBaratos;
	}

	public static void main(String[] args) {
		LivrariaOnline livrariaOnline = new LivrariaOnline();

		livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
		livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
		livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos",
				"Josh Malerman", 19.99d);
		livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
		livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
		livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente",
				"Agatha Christie", 5d);
		
		System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
		System.out.println(livrariaOnline.obterLivroMaisCaro());
		System.out.println(livrariaOnline.obterLivroMaisBarato());
	}

}

