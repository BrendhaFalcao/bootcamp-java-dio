package ordenacao.agendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	protected Map<LocalDate, Evento> agendaDeEventos;

	public AgendaEventos() {
		this.agendaDeEventos = new HashMap<LocalDate, Evento>();
	}
	
	protected void adicionarEvento(LocalDate data, String nome, String atracao) {
		agendaDeEventos.put(data, new Evento(nome, atracao));
	}
	
	protected void exibirAgenda(){
		Map<LocalDate, Evento> eventosPorData = new TreeMap<>(agendaDeEventos);
		for (Map.Entry<LocalDate, Evento> entry : eventosPorData.entrySet()) {
		      LocalDate dataEvento = entry.getKey();
		      Evento evento = entry.getValue();
		      System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNomeEvento() + ", Atração: " + evento.getNomeAtracao());
		    }
	}
	
	protected void obterProximoEvento() {
	    LocalDate dataAtual = LocalDate.now();
	    LocalDate proximaData = null;
	    Evento proximoEvento = null;
	    for (Map.Entry<LocalDate, Evento> entry : agendaDeEventos.entrySet()) {
	      LocalDate dataEvento = entry.getKey();
	      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
	        proximaData = dataEvento;
	        proximoEvento = entry.getValue();
	        break;
	      }
	    }
	    if (proximoEvento != null) {
	      System.out.println("O próximo evento: " + proximoEvento.getNomeEvento() + " acontecerá na data " + proximaData);
	    } else {
	      System.out.println("Não há eventos futuros na agenda.");
	    }
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaDeEventos = new AgendaEventos();
		
		agendaDeEventos.adicionarEvento(LocalDate.of(2024,Month.NOVEMBER,20), "Show 01", "Mac Miller");
		agendaDeEventos.adicionarEvento(LocalDate.of(2024,Month.DECEMBER,15), "Show 02", "Doja Cat");
		agendaDeEventos.exibirAgenda();
		agendaDeEventos.obterProximoEvento();
	}
}
