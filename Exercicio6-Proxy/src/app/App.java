package app;

import model.Component;
import model.ComponentConcreto;
import model.Interceptador;
import model.InterceptadorLog;
import model.InterceptadorMinuto;

public class App {

	public static void main(String[] args) {
		
		Component component = new ComponentConcreto();
		Interceptador interceptador = new Interceptador(component);
		InterceptadorLog interceptadorLog = new InterceptadorLog(component);
		InterceptadorMinuto interceptadorMinuto = new InterceptadorMinuto(component);

		interceptadorLog.executarTarefa();
		interceptadorMinuto.executarTarefa();
		interceptador.executarTarefa();
	}

}
