package model;

import java.util.ArrayList;
import java.util.List;

public interface AbstracaoLista {
	
	List<String> lista = new ArrayList<>();

	public void adicionar(String s);
	
	public String imprimir(int index);
}
