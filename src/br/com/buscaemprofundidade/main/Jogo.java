package br.com.buscaemprofundidade.main;

import br.com.buscaemprofundidade.busca.BuscaEmProfundidade;
import br.com.buscaemprofundidade.entity.No;

public class Jogo {
    private final static String OBJETIVO = "12345678X";
    private final static String ESTADO_ATUAL = "12345X786";

    public static void main(String[] args) {
        BuscaEmProfundidade bep = new BuscaEmProfundidade(new No(ESTADO_ATUAL), OBJETIVO);
        bep.busca();
    }
}
