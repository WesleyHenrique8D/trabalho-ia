package br.com.buscaemprofundidade.main;

import br.com.buscaemprofundidade.busca.BuscaEmProfundidade;
import br.com.buscaemprofundidade.entity.No;

public class Jogo {
	private final static String OBJETIVO = "1238X4765";
	private final static String ESTADO_ATUAL = "1348627X5";

	public static void main(String[] args) {
        BuscaEmProfundidade bep = new BuscaEmProfundidade(new No(ESTADO_ATUAL), OBJETIVO);
        bep.busca();
	}
}
