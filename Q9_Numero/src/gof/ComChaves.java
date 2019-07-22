package gof;

public class ComChaves extends NumeroDecorator{

	public ComChaves(Numero numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.print("{");
		getNumero().imprimir();
		System.out.print("}");
	}

}
