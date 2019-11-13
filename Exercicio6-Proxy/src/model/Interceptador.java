package model;

public class Interceptador implements Component{

	private Component component;
	
	public Interceptador(Component component) {
		this.component = component;
	}
	
	@Override
	public void executarTarefa() {
		long antes = System.currentTimeMillis();
		component.executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println((depois-antes) + " ms");
	}

}
