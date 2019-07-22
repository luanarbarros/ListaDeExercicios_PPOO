package gof;

public class ItemAsterisco implements ItemTipo {

	@Override
	public void imprimirLista(Lista lista) {
		System.out.println("Com Asterisco");
		for(int index = 0; index < lista.lista.size(); index++) {
			System.out.println("* " + lista.lista.get(index));
		}
	}

}
