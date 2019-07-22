package gof;

public class Individuo implements Participante{
	
	private String nome;
	private int assento;
	
	public Individuo (String nome, int assento) {
		this.nome = nome;
		this.assento = assento;
	}
	
	@Override
	public void addParticipante(Participante p) {
		System.out.println("N�o � poss�vel adicionar indiv�duo no indiv�duo"); 
	}

	@Override
	public void removeParticipante(Participante p) {
		System.out.println("N�o � poss�vel remover indiv�duo no indiv�duo");
	}
	
	@Override
	public int getQuantidade() {
		return 1;
	}

	@Override
	public boolean temParticipante() {
		return false;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
		
	}
	
	public String toString() {
		return "   - " + this.nome + " -> assento: "+ this.assento;
	}
	
	

}
