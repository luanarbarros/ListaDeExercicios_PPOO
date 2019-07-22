package gof;

public class ItemLetra implements ItemTipo {

	@Override
	public void imprimirLista(Lista lista) {
		
		System.out.println("Com Letra");
		for(int index = 0; index < lista.lista.size(); index++) {
			System.out.println(getLetra(index) + "-" + lista.lista.get(index));
		}
	}
	
	private String getLetra(int index) {
		/*** Em homenagem a Gutierrez que me obrigou a implementar esta função ***/
		int restante = index;
		String saidaString = "";
		
		while (restante > 25) {
			saidaString = (char)(restante%26 + 97) + saidaString;
			restante = (int) (Math.floor(restante/26)-1);
		}
		
		saidaString = (char)(restante%26 + 97) + saidaString;
		
		return saidaString;
	}

}
