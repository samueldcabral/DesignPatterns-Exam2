package model;

public class TamanhoGokuComFome extends AbstracaoTamanho{
	
	public TamanhoGokuComFome(ImplementacaoRefrigerante refri) {
		super(refri);
		tamanho = "Tamanho Goku com fome";
	}
	
	public void beber()  {
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("\n\n NOSSA COMO ELE BEBE! \n\n");
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Toma um gole de " + refrigerante + " " + tamanho);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}
