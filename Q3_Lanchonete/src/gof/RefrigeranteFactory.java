package gof;

public class RefrigeranteFactory {
	public static ImplementacaoRefrigerante getRefri(Tipo refri) {
		switch (refri) {
		case COCACOLA:
			return new CocaCola();
		case GUARANA:
			return new Guarana();
		case GUARANAJESUS:
			return new GuaranaJesus();
		default:
			return null;
		}
	}
}
