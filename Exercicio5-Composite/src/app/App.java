package app;

import model.Celula;
import model.Linha;
import model.Tabela;

public class App {

	public static void main(String[] args) {

		Tabela t = new Tabela();
		Linha l1 = new Linha();
		Linha l2 = new Linha();
		Celula c1 = new Celula("Teste teste 123");
		Celula c2 = new Celula("123456789101112");
		Celula c3 = new Celula("Samuel Deschamps Cabral");

		t.adicionar(l1);
		t.adicionar(l2);
		l1.adicionar(c1);
		l1.adicionar(c3);
		l2.adicionar(c2);
		
		t.imprimir();
	}

}
