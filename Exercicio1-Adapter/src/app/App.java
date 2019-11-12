package app;

import java.util.HashMap;

import model.AdapterMatrix;

public class App {

	public static void main(String[] args) {
		String[][] matrix = {
							{"Chave 1", "Valor 1"},
							{"Chave 2", "Valor 2"},
							{"Chave 3", "Valor 3"}
													};
		
		AdapterMatrix adaptador = new AdapterMatrix();
		
		HashMap<String, String> meuHash = new HashMap<>();
		
		meuHash = adaptador.adapterMap(matrix);
		
		meuHash.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " - " + entry.getValue());  
		 });
		
		System.out.println("\n" + meuHash);
		
	}

}
