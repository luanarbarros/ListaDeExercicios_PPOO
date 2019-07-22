package gof;

import java.util.ArrayList;

public class Congresso {
	private String nome;
	private ArrayList<Participante> participantes;
	private int assentosOcupados = 0;
	
	public Congresso (String nome) {
		this.nome = nome;
		this.participantes = new ArrayList<Participante>();
	}
	
	public int proximoAssentoDisponivel() {
		return ++this.assentosOcupados;
	}
	
	public void adicionarParticipante(Participante p) {
		this.participantes.add(p);
	}
	
	public int totalParticipantes() {
		int total = this.assentosOcupados;
		for (int i = 0; i < this.participantes.size(); i++) {
			if (this.participantes.get(i).temParticipante())
				total = total + 1;
		}

		return total;
	}
	
	public double totalAssentos() {
		return this.assentosOcupados;
	}
	
	public String toString() {
		String text = "Congresso: " + this.nome + "\n";
		text += "Total de participantes (indivíduos + instituições): " + this.totalParticipantes() + "\n";
		text += "Total de assentos ocupados: " + this.assentosOcupados + "\n";
		text += "Participantes: \n";
		for (int i = 0; i < this.participantes.size(); i++) {
			text += this.participantes.get(i).toString() + "\n";
		}
		
		return text;
	}

}
