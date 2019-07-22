package gof;

import java.util.ArrayList;

public class SomadorAdapter implements SomadorEsperado{

	private static SomadorExistente adder = new SomadorExistente();
	@Override
	public int somaVetor(int[] vetor) {
		
		int result;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++) {
			list.add(vetor[i]);
		}
		result = adder.somaLista(list);
		return result;
	}
	
}
