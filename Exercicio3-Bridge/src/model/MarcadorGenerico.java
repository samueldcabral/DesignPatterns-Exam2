package model;

public class MarcadorGenerico extends ImplementacaoImprime{
	protected String marcador;

	public MarcadorGenerico(AbstracaoLista lista, String marcador) {
		super(lista);
		this.marcador = marcador;
	}

	@Override
	public void imprimir() {
		int index = 0;
		for(String item : minhaLista.lista) {
			String itemImprime = minhaLista.imprimir(index);
			System.out.println(this.marcador + " " + itemImprime );
			index++;
		}
	}
}
