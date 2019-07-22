package gof;

public class Cliente {

	public static void main(String[] args) {
		
		/*** Listas N�o Ordenadas ***/
		/*** Com Letra ***/
		//Lista minhaLista = new ListaNaoOrdenada(new ItemLetra());
		/*** Com N�mero ***/
		// Lista minhaLista = new ListaNaoOrdenada(new ItemNumero());
		/*** Com Asterisco ***/
		// Lista minhaLista = new ListaNaoOrdenada(new ItemAsterisco());
		
		/*** Listas Ordenadas ***/
		/*** Com Letra ***/
		Lista minhaLista = new ListaOrdenada(new ItemLetra());
		/*** Com N�mero ***/
		// Lista minhaLista = new ListaOrdenada(new ItemNumero());
		/*** Com Asterisco ***/
		// Lista minhaLista = new ListaOrdenada(new ItemAsterisco());
		
		/***  Adicionando itens � lista ***/
		for (int i=0; i<100; i++) {
			minhaLista.adicionar("Luana");
		}
		
		minhaLista.adicionar("A");
		minhaLista.adicionar("C");
		minhaLista.adicionar("B");
		
		minhaLista.imprimir();
		

//		
//		
//		
//		for (int i=0; i<100; i++) {
//			minhaLista.adicionar("*** Luana ***");
//		}
//		
//		minhaLista.imprimir();
		
	}
}
