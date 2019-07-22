package gof;

public class Client {

	public static void main(String[] args) {
		// Mode 1:
//		AbstracaoTamanho luhRefri = new TamanhoMedio(RefrigeranteFactory.getRefri(Tipo.COCACOLA));
//		AbstracaoTamanho daltroRefri = new TamanhoPequeno(RefrigeranteFactory.getRefri(Tipo.GUARANA));
//		AbstracaoTamanho gutoRefri = new TamanhoGrande(RefrigeranteFactory.getRefri(Tipo.GUARANAJESUS));
//		
//		luhRefri.beber();
//		daltroRefri.beber();
//		gutoRefri.beber();
		
		// Mode 2:
		Pessoa luana = new Pessoa ("Luana", new TamanhoMedio(RefrigeranteFactory.getRefri(Tipo.COCACOLA)));
		Pessoa daltro = new Pessoa ("Daltro", new TamanhoPequeno(RefrigeranteFactory.getRefri(Tipo.GUARANA)));
		Pessoa guto = new Pessoa ("Guto", new TamanhoGrande(RefrigeranteFactory.getRefri(Tipo.GUARANAJESUS)));
		luana.beber();
		daltro.beber();
		guto.beber();


	}

}
