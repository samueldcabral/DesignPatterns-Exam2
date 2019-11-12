package model;

import java.util.Collections;

public class ListaNaoOrdenada implements AbstracaoLista{

	public ListaNaoOrdenada() {
		lista.clear();
	}
	
	@Override
	public void adicionar(String s) {
		lista.add(s);
	}

	@Override
	public String imprimir(int index) {
		return lista.get(index);
	}
}
