package app;

import model.ChaveDecorator;
import model.ColcheteDecorator;
import model.Numero;
import model.NumeroDois;
import model.NumeroUm;
import model.ParentesisDecorator;

public class App {

	public static void main(String[] args) {
		
		//Gerando pelas classes concretas de numeros
		
		Numero numero = new NumeroUm();
		numero = new ParentesisDecorator(numero);
		numero = new ChaveDecorator(numero);
		numero = new ColcheteDecorator(numero);
		
		System.out.println(numero.imprimir()); // [{(1)}]
		
		Numero numero2 = new NumeroDois();
		numero2 = new ColcheteDecorator(numero2);
		numero2 = new ChaveDecorator(numero2);
		numero2 = new ParentesisDecorator(numero2);
		
		System.out.println(numero2.imprimir()); // ({[2]})
		
		//Fazer agora de forma dinamica
		
		Numero numero3 = new Numero(3);
		numero3 = new ParentesisDecorator(numero3);
		numero3 = new ChaveDecorator(numero3);
		numero3 = new ColcheteDecorator(numero3);
		
		System.out.println(numero3.imprimir()); // [{(3)}]
		
		Numero numero123 = new Numero(123);
		numero123 = new ChaveDecorator(numero123);
		
		System.out.println(numero123.imprimir()); // {123}
		
		Numero numero9999 = new Numero(9999);
		numero9999 = new ParentesisDecorator(numero9999);
		
		System.out.println(numero9999.imprimir()); // (9999)
		
		Numero numeroMenos1 = new Numero(-1);
		numeroMenos1 = new ColcheteDecorator(numeroMenos1);
		
		System.out.println(numeroMenos1.imprimir()); // [-1]
	}
}
