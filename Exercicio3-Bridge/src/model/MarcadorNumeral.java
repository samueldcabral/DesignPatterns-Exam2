package model;

public class MarcadorNumeral extends ImplementacaoMarcador{

	public MarcadorNumeral() {
	}

	@Override
	public String imprimirMarcador(int index) {
		return (index + 1) + ")";
	}
}