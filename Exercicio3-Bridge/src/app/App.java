package app;

import model.AbstracaoLista;
import model.ImplementacaoMarcador;
import model.ListaNaoOrdenada;
import model.ListaOrdenada;
import model.MarcadorGenerico;
import model.MarcadorLetra;
import model.MarcadorNumeral;

public class App {

	public static void main(String[] args) {
		// Lista ordenada
		ImplementacaoMarcador marcadorNumeral = new MarcadorNumeral();

		AbstracaoLista listaOrdenada = new ListaOrdenada(marcadorNumeral);
		listaOrdenada.adicionar("Samuel");
		listaOrdenada.adicionar("Ana");
		listaOrdenada.adicionar("Carlota");
		listaOrdenada.adicionar("Zilda");
		listaOrdenada.adicionar("Natalia");
		
		listaOrdenada.imprimir();
		
		System.out.println("\n------------------------------------\n");
		//Lista Nao Ordenada
		ImplementacaoMarcador marcadorLetra = new MarcadorLetra();
		AbstracaoLista listaNaoOrdenada = new ListaNaoOrdenada(marcadorLetra);
		listaNaoOrdenada.adicionar("Samuel");
		listaNaoOrdenada.adicionar("Ana");
		listaNaoOrdenada.adicionar("Carlota");
		listaNaoOrdenada.adicionar("Zilda");
		listaNaoOrdenada.adicionar("Natalia");
		
		listaNaoOrdenada.imprimir();
		
		System.out.println("\n------------------------------------\n");
		//Lista Nao Ordenada
		ImplementacaoMarcador marcadorGen = new MarcadorGenerico("*");
		AbstracaoLista listaOrdenada2 = new ListaOrdenada(marcadorGen);
		listaOrdenada2.adicionar("Zeze");
		listaOrdenada2.adicionar("Didi");
		listaOrdenada2.adicionar("Lady Gaga");
		listaOrdenada2.adicionar("Roberto Carlos");
		listaOrdenada2.adicionar("Fonz");
		
		listaOrdenada2.imprimir();
	
	}
}
