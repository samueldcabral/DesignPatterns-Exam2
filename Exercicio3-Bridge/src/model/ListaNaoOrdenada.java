package model;

public class ListaNaoOrdenada implements AbstracaoLista{

	private ImplementacaoMarcador marcador;
	
	public ListaNaoOrdenada(ImplementacaoMarcador marcador) {
		this.marcador = marcador;
		lista.clear();
	}
	
	@Override
	public void adicionar(String s) {
		lista.add(s);
	}

	@Override
	public void imprimir() {
		int index = 0;
		
		for(String item : lista) {
			String m = marcador.imprimirMarcador(index);
			System.out.println(m + " " + item);
			index++;
		}
	}
}
