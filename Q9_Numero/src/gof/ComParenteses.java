package gof;

public class ComParenteses extends NumeroDecorator{

	public ComParenteses(Numero numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.print("(");
		getNumero().imprimir();
		System.out.print(")");
	}

}
