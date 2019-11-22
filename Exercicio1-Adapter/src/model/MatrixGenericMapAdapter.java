package model;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class MatrixGenericMapAdapter extends AbstractMap<String, String> implements MatrixMap {
	
	private Map<String, String> matrixMap;
			
	public MatrixGenericMapAdapter(String[][] matrix, Object obj) {
		final int KEY = 0;
		final int VALUE = 1;
		
		matrixMap = (Map<String, String>) obj;
		
		for(String[] matrixObj : matrix) {
			matrixMap.put(matrixObj[KEY], matrixObj[VALUE]);
		}
	}
	
	@Override
	public Map<String, String> getMatrixMap() {
		return this.matrixMap;
	}
	
	@Override
	public Set<Entry<String, String>> entrySet() {
		return matrixMap.entrySet();
	}
}
