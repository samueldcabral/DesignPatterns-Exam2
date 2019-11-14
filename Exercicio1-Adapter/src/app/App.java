package app;

import java.util.HashMap;
import java.util.TreeMap;

import model.AdapterMatrix;

public class App {

	public static void main(String[] args) {
		String[][] matrix = {
							{"Chave 1", "Valor 1"},
							{"Chave 2", "Valor 2"},
							{"Chave 3", "Valor 3"}
													};
		
		//Exemplo com Hash Map
		HashMap<String, String> typeMap = new HashMap<>();
		AdapterMatrix adaptador = new AdapterMatrix(typeMap);
		
		HashMap<String, String> meuHash = new HashMap<>();
		
		meuHash = (HashMap<String, String>) adaptador.getMap(matrix);
		
		System.out.println("Imprimindo Hash Map....\n");
		meuHash.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " - " + entry.getValue());  
		 });
		
		System.out.println("\n" + meuHash);
	
		System.out.println("\n------------------------------------------------\n");
		//Exemplo com Tree Map
		TreeMap<String, String> typeTree = new TreeMap<>();
		AdapterMatrix adaptadorNovo = new AdapterMatrix(typeTree);
		
		TreeMap<String, String> meuTree = new TreeMap<>();
		
		meuTree = (TreeMap<String, String>) adaptadorNovo.getMap(matrix);
		
		System.out.println("Imprimindo Tree Map....\n");
		meuTree.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		});
		
		System.out.println("\n" + meuTree);
	}
}
