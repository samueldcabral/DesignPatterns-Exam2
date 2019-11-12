package model;

public class MarcadorNumeral extends ImplementacaoImprime{

	public MarcadorNumeral(AbstracaoLista lista) {
		super(lista);
	}

	@Override
	public void imprimir() {
		int index = 0;
		for(String item : minhaLista.lista) {
			String itemImprime = minhaLista.imprimir(index);
			index++;
			System.out.println(index + ") " + itemImprime );
		}
	}
}