package model;

import java.util.ArrayList;
import java.util.List;

public interface AbstracaoLista {
	
	ImplementacaoMarcador marcador = null;
	
	List<String> lista = new ArrayList<>();

	public void adicionar(String s);
	
	public default void imprimir() {};
}
