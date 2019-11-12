package model;

import java.util.HashMap;

public class AdapterMatrix {
	HashMap<String, String> map = new HashMap<>();
	
	public HashMap adapterMap(String[][] matrix) {
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				map.put(matrix[i][0], matrix[i][j]);
			}
		}
		 
		return map;
	}
}
