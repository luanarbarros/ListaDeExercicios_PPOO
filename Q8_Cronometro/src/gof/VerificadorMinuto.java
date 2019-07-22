package gof;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VerificadorMinuto extends ComponenteDecorator{

	public VerificadorMinuto(Componente componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executarTarefa() {
		Date data = new Date();
		SimpleDateFormat hour = new SimpleDateFormat("hh:mm:ss");
		@SuppressWarnings("deprecation")
		int minutos = data.getMinutes();
		
		if (minutos % 2 == 0) {
			System.out.println("Execução interrompida em minuto par: " + hour.format(data));
		}
		else
			this.getComponente().executarTarefa();
	}

}
