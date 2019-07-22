package gof;

public class Celula implements CompositeTabela{
	
	private String conteudo;
	
	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}
	
	@Override
	public void imprimir() {
		
		if (this.conteudo.length() > 15)
			this.conteudo = this.conteudo.substring(0, 15);
		
		System.out.printf(" %-15s ", this.conteudo);
	}
	@Override
	public void adicionarElemento(CompositeTabela elemento) {
		System.out.println("Não é possível adicionar elemento em célula");
	}
}
