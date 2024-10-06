package collections.list.src.pesquisa.catalogoDeLivrosa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	//atributo do tipo List com objetos tipo Livro
	private List<Livro> catalogoDeLivros;

	//construtor de CatalogoLivros
	public CatalogoLivros() {
		this.catalogoDeLivros = new ArrayList<>();
	}
	
	//adiciona um livro no catalogoDeLivros
	public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
		this.catalogoDeLivros.add(new Livro(titulo, autor, anoDePublicacao));
	}
	
	//método que cria uma lista com os livros do autor passado como parâmetro
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> listaPorAutor = new ArrayList<>();
		
		if(!catalogoDeLivros.isEmpty()) {
			for(Livro l : catalogoDeLivros) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					listaPorAutor.add(l);
				}
			}
		}
		return listaPorAutor;
	}
	
	//método que cria uma lita com os livros dentro do intervalo de anos
	//passado como parâmetro
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> listaPorAno = new ArrayList<>();
		
		if(!catalogoDeLivros.isEmpty()) {
			for(Livro l : catalogoDeLivros) {
				if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
					listaPorAno.add(l);
				}
			}
		}
		
		return listaPorAno;
		}

		
	//método que retorna o objeto livro com o título como parâmetro
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livro = null;		
		
		if(!catalogoDeLivros.isEmpty()) {
			for(Livro l : catalogoDeLivros) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livro = l;
				}
			}
		}
		return livro;
	}
	
	public void mostrarCatalogoDeLivros() {
		System.out.println(catalogoDeLivros);
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2022);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2023);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 1", 2024);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2025);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2022, 2024));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
	}
}
