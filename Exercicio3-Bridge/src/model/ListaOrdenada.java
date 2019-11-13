package model;

import java.util.Collections;

public class ListaOrdenada implements AbstracaoLista{
	private ImplementacaoMarcador marcador;

	public ListaOrdenada(ImplementacaoMarcador marcador) {
		this.marcador = marcador;
		lista.clear();
	}
	
	@Override
	public void adicionar(String s) {
		lista.add(s);	
		Collections.sort(lista);
	}

	@Override
	public void imprimir() {
		int index = 0;
		
		for(String item : lista) {
			String m = marcador.imprimirMarcador(index);
			System.out.println(m + " " + item);
			index++;
		}
	}
}
