package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InterceptadorLog implements Component{

	private Component component;
	
	public InterceptadorLog(Component component) {
		this.component = component;
	}
	
	@Override
	public void executarTarefa() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYY - HH:mm:ss");
		Date hora = Calendar.getInstance().getTime();
		String dataHora = formatter.format(hora);
		System.out.println("< " + dataHora + " > : mensagem de log....");
		component.executarTarefa();
	}
}
