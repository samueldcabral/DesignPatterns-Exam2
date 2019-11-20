package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InterceptadorMinuto implements Component{

	private Component component;
	
	public InterceptadorMinuto(Component component) {
		this.component = component;
	}
	
	@Override
	public void executarTarefa() {
		SimpleDateFormat formatterMinuto = new SimpleDateFormat("mm");
		SimpleDateFormat formatterHora = new SimpleDateFormat("HH:mm:ss");
		Date hora = Calendar.getInstance().getTime();
		
		int minuto = Integer.parseInt(formatterMinuto.format(hora));
		String dataHora = formatterHora.format(hora);
		
		if(minuto % 2 == 0) {
			System.out.println("Execução interrompida em minuto par: < " + dataHora + " >");
		}else {
			component.executarTarefa();
			System.out.println("Execução finalizada com sucesso!");
		}
	}
}
