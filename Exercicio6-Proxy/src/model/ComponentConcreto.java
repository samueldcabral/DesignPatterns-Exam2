package model;

public class ComponentConcreto implements Component{

	@Override
	public void executarTarefa() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
