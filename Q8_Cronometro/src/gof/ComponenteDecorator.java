package gof;

public abstract class ComponenteDecorator implements Componente{
	private Componente componente;
	
	public ComponenteDecorator(Componente componente) {
		this.componente = componente;
	}
	
	public Componente getComponente () {
		return this.componente;
	}
}
