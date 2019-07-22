package gof;

public class Cliente {

	public static void main(String[] args) {
		
		Numero um = new NumeroUm();
		
		Numero umComParentes = new ComParenteses(um);
		
		Numero umComChaves = new ComChaves(um);
		
		Numero umParentesChaves = new ComParenteses(new ComChaves(um));
		
		Numero umChavesParentes = new ComChaves(new ComParenteses(um));
		
		umComParentes.imprimir();
		umComChaves.imprimir();
		umParentesChaves.imprimir();
		umChavesParentes.imprimir();

	}

}
