package app;

import model.AbstracaoLista;
import model.ImplementacaoImprime;
import model.ListaNaoOrdenada;
import model.ListaOrdenada;
import model.MarcadorGenerico;
import model.MarcadorLetra;
import model.MarcadorNumeral;

public class App {

	public static void main(String[] args) {
		// Lista ordenada
		AbstracaoLista listaOrdenada = new ListaOrdenada();
		ImplementacaoImprime marcadorNumeral = new MarcadorNumeral(listaOrdenada);
		listaOrdenada.adicionar("Samuel");
		listaOrdenada.adicionar("Ana");
		listaOrdenada.adicionar("Carlota");
		listaOrdenada.adicionar("Zilda");
		listaOrdenada.adicionar("Natalia");
		
		marcadorNumeral.imprimir();
		
		System.out.println("\n------------------------------------\n");
		//Lista Nao Ordenada
		AbstracaoLista listaNaoOrdenada = new ListaNaoOrdenada();
		ImplementacaoImprime marcadorLetra = new MarcadorLetra(listaNaoOrdenada);
		listaNaoOrdenada.adicionar("Samuel");
		listaNaoOrdenada.adicionar("Ana");
		listaNaoOrdenada.adicionar("Carlota");
		listaNaoOrdenada.adicionar("Zilda");
		listaNaoOrdenada.adicionar("Natalia");
		
		marcadorLetra.imprimir();
		
		System.out.println("\n------------------------------------\n");
		//Lista Nao Ordenada
		AbstracaoLista listaOrdenada2 = new ListaOrdenada();
		ImplementacaoImprime marcadorGen = new MarcadorGenerico(listaOrdenada2, "*");
		listaOrdenada2.adicionar("Zeze");
		listaOrdenada2.adicionar("Didi");
		listaOrdenada2.adicionar("Lady Gaga");
		listaOrdenada2.adicionar("Roberto Carlos");
		listaOrdenada2.adicionar("Fonz");
		
		marcadorGen.imprimir();
	
	}
}
