package gof;

public class Cronometro extends ComponenteDecorator {

	public Cronometro(Componente componente) {
		super(componente);
	}
	
	@Override
	public void executarTarefa() {
		long antes = System.currentTimeMillis();
		this.getComponente().executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println((depois - antes) + " ms");
	}
}
