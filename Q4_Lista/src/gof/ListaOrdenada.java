package gof;

public class ListaOrdenada extends Lista{

	public ListaOrdenada(ItemTipo itemTipo) {
		super(itemTipo);
	}
	
	@Override
	public void adicionar(String item) {
		this.lista.add(item);
		java.util.Collections.sort(this.lista);
	}

	@Override
	public void imprimir() {
		this.itemTipo.imprimirLista(this);
	}	
	
}
