package model;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements Component {

	private List<Linha> linhas = new ArrayList<>();
	
	public void adicionar(Linha l) {
		linhas.add(l);
	}
	
	public void imprimir() {
		for(Linha l : linhas) {
			l.imprimir();
		}
	}
}
