package gof;

public class Pessoa {
	private String nome;
	private AbstracaoTamanho refri;
	
	public Pessoa (String nome, AbstracaoTamanho refri) {
		this.nome = nome;
		this.refri = refri;
	}
	
	public void beber() {
		System.out.println(nome + ":");
		refri.beber();
	}
}
