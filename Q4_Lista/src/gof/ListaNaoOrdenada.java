package gof;

public class ListaNaoOrdenada extends Lista{

	public ListaNaoOrdenada(ItemTipo itemTipo) {
		super(itemTipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void adicionar(String item) {
		this.lista.add(item);
	}

	@Override
	public void imprimir() {
		this.itemTipo.imprimirLista(this);
	}

}
