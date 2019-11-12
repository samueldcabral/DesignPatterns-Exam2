package model;

import java.util.Collections;

public class ListaOrdenada implements AbstracaoLista{

	public ListaOrdenada() {
		lista.clear();
	}
	
	@Override
	public void adicionar(String s) {
		lista.add(s);	
		Collections.sort(lista);
	}

	@Override
	public String imprimir(int index) {
		return lista.get(index);
	}

}
