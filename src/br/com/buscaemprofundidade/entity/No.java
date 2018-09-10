package br.com.buscaemprofundidade.entity;

import java.util.ArrayList;

public class No {

	private ArrayList<No> nosFilhos;
	private No noPai;
	private String estado;

	public No(String estado) {
		this.estado = estado;
		nosFilhos = new ArrayList<>();
	}

	public ArrayList<No> getNosFilhos() {
		return nosFilhos;
	}

	public void setNosFilhos(ArrayList<No> nosFilhos) {
		this.nosFilhos = nosFilhos;
	}

	public No getNoPai() {
		return noPai;
	}

	public void setNoPai(No noPai) {
		this.noPai = noPai;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void addFilhos(No noFilho) {
		this.nosFilhos.add(noFilho);
	}
	
	@Override
	public String toString() {
		return estado;
	}
}
