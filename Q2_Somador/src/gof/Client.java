package gof;

public class Client {
	
	// TESTAR ALGORITMO NA CLASSE "Application"
	private SomadorEsperado somador;

	public Client(SomadorEsperado somador) {
		this.somador = somador;
	}

	public void executar() {
		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado: " + soma);
	}
}
