package aplicacaoIphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.atender();
		iphone.selecionarMusica("espresso");
		iphone.ligar("222-333-444");
		iphone.exibirPagina("google.com");
	}

	// Implementando métodos do NavegadorNaInternet
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}

	// Implementando métodos do AparelhoTelefonico
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
		
	}	

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

	// Implementando métodos do ReprodutorMusical
	
	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Tocando " + musica);
		
	}

}
