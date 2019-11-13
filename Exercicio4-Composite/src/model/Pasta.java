package model;

import java.util.ArrayList;

public class Pasta implements Component {
	private String nome;
	private int quantidadeArquivos;
	private int quantidadeSubPastas;
	private ArrayList<Arquivo> arquivos = new ArrayList<>();
	private ArrayList<Pasta> subpastas = new ArrayList<>();

	public Pasta(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Arquivo> getArquivos() {
		return arquivos;
	}

	public void setArquivos(ArrayList<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}

	public void addArquivos(Arquivo arquivo) {
		this.arquivos.add(arquivo);
	}
	
	public void removeArquivos(Arquivo arquivo) {
		this.arquivos.remove(arquivo);
	}
	
	public ArrayList<Pasta> getSubpastas() {
		return subpastas;
	}

	public void setSubpastas(ArrayList<Pasta> subpastas) {
		this.subpastas = subpastas;
	}

	public void addSubPasta(Pasta subpasta) {
		this.subpastas.add(subpasta);
	}
	
	public void removeSubPasta(Pasta subpasta) {
		this.subpastas.remove(subpasta);
	}

	public void imprimir() {
		this.quantidadeArquivos = arquivos.size();
		this.quantidadeSubPastas = subpastas.size();
		
		System.out.println("Pasta: " + this.nome + " tem " + this.quantidadeArquivos + " arquivos e " + this.quantidadeSubPastas + " subpastas.\n");

		for(Arquivo arquivo : arquivos) {
			arquivo.imprimir();
		}
		
		for(Pasta pasta : subpastas) {
			pasta.imprimir();
		}
	}

}
