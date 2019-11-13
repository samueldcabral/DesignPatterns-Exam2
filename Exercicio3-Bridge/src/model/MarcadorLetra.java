package model;

public class MarcadorLetra extends ImplementacaoMarcador{
	
	public MarcadorLetra() {}

	@Override
	public String imprimirMarcador(int posicao) {
		int unicodeIntLetraA = 65;
		String letraMarcador = Character.toString((char) (unicodeIntLetraA + posicao));
		return letraMarcador + ")";
	}
}