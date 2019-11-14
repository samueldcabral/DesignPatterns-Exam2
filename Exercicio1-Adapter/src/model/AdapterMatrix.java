package model;

import java.util.Map;

public class AdapterMatrix implements MatrixToMap{
	private Map<String, String> map;
			
	public AdapterMatrix(Map<String, String> mapa) {
		this.map = mapa;
	}
	
	@Override
	public Map<String, String> getMap(String[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				map.put(matrix[i][0], matrix[i][j]);
			}
		}
		return map;
	}
}
