package gof;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log extends ComponenteDecorator{

	public Log(Componente componente) {
		super(componente);
	}

	@Override
	public void executarTarefa() {
		Date data = new Date();
		SimpleDateFormat dateAndHour = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		System.out.println("Data e Hora: " + dateAndHour.format(data));
		this.getComponente().executarTarefa();
	}

}
