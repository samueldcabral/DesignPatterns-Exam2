package model;

public class TamanhoGrande extends AbstracaoTamanho{
	
	public TamanhoGrande(ImplementacaoRefrigerante refri) {
		super(refri);
		tamanho = "Tamanho Grande";
	}
	
	public void beber()  {
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}
