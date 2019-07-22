package gof;

import java.util.ArrayList;
import java.util.List;

public class Linha implements CompositeTabela {
	
	private List<CompositeTabela> celulas = new ArrayList<CompositeTabela>();
	private static int maiorQtdCelulas = 0;
	
	public void imprimir() {
		// Imprime a linha.
		Linha.imprimirLinha();
		// Imprime a borda lateral.
		System.out.print(" |");
		
		for (int j = 0; j < this.celulas.size(); j++) {
			this.celulas.get(j).imprimir();
			System.out.print("|");
		}
			
		
		for (int k = 0; k < (Linha.maiorQtdCelulas - this.celulas.size()); k++)
		{
			System.out.printf("%-17s|", "");
		}
		
		
		System.out.print("\n");
	}
	
	static public void imprimirLinha() {
		// Imprime a linha.
		int tamanho = (maiorQtdCelulas * 18) + 1;
		char[] linha = new char[tamanho];
		
		for (int i = 0; i < tamanho; i++)
			linha[i] = '-';
		
		System.out.println(" " + new String(linha));
	}
	
	@Override
	public void adicionarElemento(CompositeTabela elemento) {
		celulas.add(elemento);
		if (celulas.size() > maiorQtdCelulas) maiorQtdCelulas = celulas.size();
	}
}
