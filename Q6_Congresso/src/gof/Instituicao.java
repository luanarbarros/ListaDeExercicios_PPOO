package gof;

import java.util.ArrayList;

public class Instituicao implements Participante{
	
	private String nome;
	private ArrayList<Participante> membros;
	
	public Instituicao(String nome) {
		this.nome = nome;
		this.membros = new ArrayList<Participante>();
	}
	
	@Override
	public void addParticipante(Participante p) {
		membros.add(p);
	}
	
	@Override
	public void removeParticipante(Participante p) {
		membros.remove(p);
	}

	@Override
	public int getQuantidade() {
		return membros.size();
	}
	
	@Override
	public boolean temParticipante() {
		return true;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		String text = "********************INSTITUIÇÃO********************\n";
		
		text += "  *" + this.nome + "\n" + "   Membros: \n";
		for (int i = 0; i < this.membros.size(); i++) {
			text += this.membros.get(i).toString() + "\n";
		}
		text += "\n***************************************************";
		return text;
	}

}
