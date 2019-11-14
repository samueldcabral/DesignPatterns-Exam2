package model;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements Component {

	private List<Component> linhas = new ArrayList<>();
	
	public void adicionar(Linha l) {
		linhas.add(l);
	}
	
	public void imprimir() {
		for(Component l : linhas) {
			l.imprimir();
		}
	}
}
