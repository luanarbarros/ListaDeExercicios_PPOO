package gof;

public class Cliente {

	public static void main(String[] args) {

		CompositeTabela c1 = new Celula("Luana");
		CompositeTabela c2 = new Celula("Gutierrez");
		CompositeTabela c3 = new Celula("Queremos Ferias Urgente");
		CompositeTabela c4 = new Celula("Queremos Viajar");
		
		CompositeTabela l1 = new Linha();
		CompositeTabela l2 = new Linha();
		
		l1.adicionarElemento(c1);
		l1.adicionarElemento(c2);
		l2.adicionarElemento(c3);
		l2.adicionarElemento(c4);
		l2.adicionarElemento(c4);l2.adicionarElemento(c4);l2.adicionarElemento(c4);
		
		CompositeTabela t1 = new Tabela();
		t1.adicionarElemento(l1);
		t1.adicionarElemento(l2);
		
		Cliente.imprimir(t1);
		Cliente.imprimir(l1);
		Cliente.imprimir(c1);

	}
	
	public static void imprimir(CompositeTabela elemento) {
		elemento.imprimir();
	}

}
