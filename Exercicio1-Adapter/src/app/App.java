package app;

import java.util.HashMap;
import java.util.TreeMap;

import model.MatrixMap;
import model.MatrixTreeMapAdapter;
import model.MatrixGenericMapAdapter;
import model.MatrixHashMapAdapter;

public class App {

	public static void main(String[] args) {
		String[][] matrix = {
							{"Chave 1", "Valor 1"},
							{"Chave 2", "Valor 2"},
							{"Chave 3", "Valor 3"}
													};
		
		//Exemplo com Hash Map
		
		//Instancia a interface com o adaptador do hashmap e passa a matriz.
		MatrixMap matrixMap1 = new MatrixHashMapAdapter(matrix);
		
		//Utiliza o método getMatrixMap para pegar o objeto Map.
		HashMap<String, String> meuHash = (HashMap<String, String>) matrixMap1.getMatrixMap();
		

		System.out.println("Imprimindo Hash Map....\n");
		meuHash.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " - " + entry.getValue());  
		 });

		
		System.out.println("\n------------------------------------------------\n");
		
//		Exemplo com Tree Map
		
		MatrixMap matrixMap2 = new MatrixTreeMapAdapter(matrix);
		TreeMap<String, String> meuTree = (TreeMap<String, String>) matrixMap2.getMatrixMap();

		System.out.println("Imprimindo Tree Map....\n");
		meuTree.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		});
		
		System.out.println("\n------------------------------------------------\n");
		
//		Exemplo com Generic Map
		
		TreeMap<String, String> meuGenericTree = new TreeMap<>();
		MatrixMap matrixMap3 = new MatrixGenericMapAdapter(matrix, meuGenericTree);
		meuGenericTree = (TreeMap<String, String>) matrixMap3.getMatrixMap();

		System.out.println("Imprimindo Generic Map com TreeMap....\n");
		meuGenericTree.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		});
		
		System.out.println("\n------------------------------------------------\n");
		
//		Exemplo com Generic Map
		
		HashMap<String, String> meuGenericHash = new HashMap<>();
		MatrixMap matrixMap4 = new MatrixGenericMapAdapter(matrix, meuGenericHash);
		meuGenericHash = (HashMap<String, String>) matrixMap4.getMatrixMap();

		System.out.println("Imprimindo Generic Map com HashMap....\n");
		meuGenericHash.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		});
		
		System.out.println("\n------------------------------------------------\n");
		
//		Imprimindo os EntrySets
		System.out.println("Imprimindo os EntrySets...\n");
		
		System.out.println(meuHash.entrySet());
		System.out.println(meuTree.entrySet());
		System.out.println(meuGenericTree.entrySet());
		System.out.println(meuGenericHash.entrySet());
			
	}
}
