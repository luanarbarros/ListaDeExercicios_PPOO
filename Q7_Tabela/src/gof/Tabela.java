package gof;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements CompositeTabela{
	
	private List<CompositeTabela> linhas = new ArrayList<CompositeTabela>();

	@Override
	public void adicionarElemento(CompositeTabela elemento) {
		linhas.add(elemento);
	}

	@Override
	public void imprimir() {
		for (int i = 0; i < this.linhas.size(); i++) {
			this.linhas.get(i).imprimir();
		}
		Linha.imprimirLinha();
	}
}