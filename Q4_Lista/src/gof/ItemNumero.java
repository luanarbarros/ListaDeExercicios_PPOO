package gof;

public class ItemNumero implements ItemTipo{

	@Override
	public void imprimirLista(Lista lista) {
		
		System.out.println("Com Numero");
		for(int index = 0; index < lista.lista.size(); index++) {
			System.out.println(index + "-" + lista.lista.get(index));
		}
		
	}

}
