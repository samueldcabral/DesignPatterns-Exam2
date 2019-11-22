package model;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MatrixTreeMapAdapter extends AbstractMap<String, String> implements MatrixMap {
	
	private Map<String, String> matrixMap;
			
	public MatrixTreeMapAdapter(String[][] matrix) {
		final int KEY = 0;
		final int VALUE = 1;
		
		matrixMap = new TreeMap<String, String>();
		
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
