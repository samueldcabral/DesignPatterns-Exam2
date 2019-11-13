package model;

import java.util.ArrayList;
import java.util.List;

public class Linha implements Component{
	private List<Celula> celulas = new ArrayList<>();
	
	public void adicionar(Celula c) {
		celulas.add(c);
	}
	
	public void imprimir() {
		String conteudoCelula = "";

		//Imprime borda
		//System.out.println(" |");
		
		int tamanho = (celulas.size() * 17) + 5;
		char[] linha = new char[tamanho];
		for(int i = 0; i < tamanho; i++) {
			linha[i] = '-';
		}
		for(Celula c : celulas) {
			c.imprimir();
		}
		System.out.println(conteudoCelula);
		System.out.println(" " + new String(linha));
	}
	
}
