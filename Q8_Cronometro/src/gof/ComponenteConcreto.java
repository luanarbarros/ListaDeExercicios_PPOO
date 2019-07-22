package gof;

class ComponenteConcreto implements Componente {
	
	public void executarTarefa() { 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}