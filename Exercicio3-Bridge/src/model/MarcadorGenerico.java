package model;

public class MarcadorGenerico extends ImplementacaoMarcador{
	protected String marcadorGenerico;

	public MarcadorGenerico(String marcador) {
		this.marcadorGenerico = marcador;
	}

	@Override
	public String imprimirMarcador(int index) {
		return marcadorGenerico;
	}


}