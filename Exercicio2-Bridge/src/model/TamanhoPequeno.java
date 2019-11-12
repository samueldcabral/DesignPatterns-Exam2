package model;

public class TamanhoPequeno extends AbstracaoTamanho {
	
	public TamanhoPequeno(ImplementacaoRefrigerante refri) {
		super(refri);
		tamanho = "Tamanho pequeno";
	}
	
	public void beber()  {
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}
