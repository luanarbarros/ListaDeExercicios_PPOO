package gof;

public class Application {

	public static void main(String[] args) {
		
		Client client = new Client(new SomadorAdapter());
		client.executar();
	}

}
