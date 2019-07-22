package gof;

public class Cliente {

	public static void main(String[] args) {
		
		Componente c = new ComponenteConcreto();
		Componente interceptadores = new Log(new VerificadorMinuto(new Cronometro(c)));
		
		interceptadores.executarTarefa();

	}

}
