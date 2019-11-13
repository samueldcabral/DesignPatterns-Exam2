package app;

import model.Arquivo;
import model.Arquivo;
import model.Pasta;

public class App {

	public static void main(String[] args) {
		//Arquivos 
		Arquivo aqv1 = new Arquivo("Padroes-GOF.pdf", 540);	
		Arquivo aqv2 = new Arquivo("Padroes_aula1.pdf", 5450);	
		Arquivo aqv3 = new Arquivo("PDM_como_criar_um_app_que_cria_apps.pdf", 19850);
		Arquivo aqv4 = new Arquivo("Android_x_IOS.ppt", 850);
		Arquivo aqv5 = new Arquivo("Kotlin-Intents.ppt", 350);
		Arquivo aqv6 = new Arquivo("Swifty-Swift.pdf", 450);
		Arquivo aqv7 = new Arquivo("PWEB2-Tomcat-Gato-Maldito.pdf", 450);
		Arquivo aqv8 = new Arquivo("PWEB2-SpringBoot.pdf", 650);
		Arquivo aqv9 = new Arquivo("PWEB2-SpringMVC.pdf", 450);
		Arquivo aqv10 = new Arquivo("PWEB2-JSF.pdf", 450);
		Arquivo aqv11 = new Arquivo("GPS.pdf", 1230);	
		Arquivo aqv12 = new Arquivo("Comercio Eletronico.pdf", 7750);	
		Arquivo aqv13 = new Arquivo("Curricullum.pdf", 950);	
		
		//Pastas
		Pasta pst1 = new Pasta("IFPB");
		Pasta pst2 = new Pasta("PWEB II");
		Pasta pst3 = new Pasta("PDM");
		Pasta pst4 = new Pasta("Padroes");
		Pasta pst5 = new Pasta("GPS");
		Pasta pst6 = new Pasta("Comercio");
		
		//Adicionando relacionamentos pastas-arquivos-subpastas
		pst1.addArquivos(aqv13);
		pst1.addSubPasta(pst2);
		pst1.addSubPasta(pst3);
		pst1.addSubPasta(pst4);
		pst1.addSubPasta(pst5);
		pst1.addSubPasta(pst6);
		
		pst2.addArquivos(aqv7);
		pst2.addArquivos(aqv8);
		pst2.addArquivos(aqv9);
		pst2.addArquivos(aqv10);
		
		pst3.addArquivos(aqv3);
		pst3.addArquivos(aqv4);
		pst3.addArquivos(aqv5);
		pst3.addArquivos(aqv6);
		
		pst4.addArquivos(aqv1);
		pst4.addArquivos(aqv2);
		
		pst5.addArquivos(aqv11);
		
		pst6.addArquivos(aqv12);
		
		//Imprimir a pasta raiz IFPB
		pst1.imprimir();
		
	}

}
