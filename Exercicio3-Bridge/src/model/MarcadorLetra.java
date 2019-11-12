package model;

public class MarcadorLetra extends ImplementacaoImprime{
	
	public MarcadorLetra(AbstracaoLista lista) {
		super(lista);
	}

	@Override
	public void imprimir() {
		int index = 0;
		for(String item : minhaLista.lista) {
			String itemImprime = minhaLista.imprimir(index);
			index++;
			String letraMarcador = Character.toString((char) (64 + index));
			System.out.println(letraMarcador + ") " + itemImprime );
		}
	}
}
