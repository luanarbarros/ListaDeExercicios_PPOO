package gof;

import java.util.ArrayList;
import java.util.List;

public abstract class Lista {
	
	protected ItemTipo itemTipo;
	protected List<String> lista;
	
	public Lista (ItemTipo itemTipo) {
		this.itemTipo = itemTipo;
		this.lista = new ArrayList<String>();
	}
	
	public abstract void adicionar(String item);
	
	public abstract void imprimir();
}
