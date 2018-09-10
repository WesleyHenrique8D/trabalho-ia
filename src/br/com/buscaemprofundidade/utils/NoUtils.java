package br.com.buscaemprofundidade.utils;
import java.util.ArrayList;
import java.util.List;

public class NoUtils {
	public static List<String> gerarFilhos(String estadoAtual) {
        List<String> filhos = new ArrayList<>();

        switch (estadoAtual.indexOf("X")) {
            case 0: {
                filhos.add(estadoAtual.replace(estadoAtual.charAt(0), '*').replace(estadoAtual.charAt(1), estadoAtual.charAt(0)).replace('*', estadoAtual.charAt(1)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(0), '*').replace(estadoAtual.charAt(3), estadoAtual.charAt(0)).replace('*', estadoAtual.charAt(3)));
                break;
            }
            case 1: {
                filhos.add(estadoAtual.replace(estadoAtual.charAt(1), '*').replace(estadoAtual.charAt(0), estadoAtual.charAt(1)).replace('*', estadoAtual.charAt(0)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(1), '*').replace(estadoAtual.charAt(2), estadoAtual.charAt(1)).replace('*', estadoAtual.charAt(2)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(1), '*').replace(estadoAtual.charAt(4), estadoAtual.charAt(1)).replace('*', estadoAtual.charAt(4)));
                break;
            }
            case 2: {

                filhos.add(estadoAtual.replace(estadoAtual.charAt(2), '*').replace(estadoAtual.charAt(1), estadoAtual.charAt(2)).replace('*', estadoAtual.charAt(1)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(2), '*').replace(estadoAtual.charAt(5), estadoAtual.charAt(2)).replace('*', estadoAtual.charAt(5)));
                break;
            }
            case 3: {
                filhos.add(estadoAtual.replace(estadoAtual.charAt(3), '*').replace(estadoAtual.charAt(0), estadoAtual.charAt(3)).replace('*', estadoAtual.charAt(0)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(3), '*').replace(estadoAtual.charAt(4), estadoAtual.charAt(3)).replace('*', estadoAtual.charAt(4)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(3), '*').replace(estadoAtual.charAt(6), estadoAtual.charAt(3)).replace('*', estadoAtual.charAt(6)));
                break;
            }
            case 4: {
                filhos.add(estadoAtual.replace(estadoAtual.charAt(4), '*').replace(estadoAtual.charAt(1), estadoAtual.charAt(4)).replace('*', estadoAtual.charAt(1)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(4), '*').replace(estadoAtual.charAt(3), estadoAtual.charAt(4)).replace('*', estadoAtual.charAt(3)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(4), '*').replace(estadoAtual.charAt(5), estadoAtual.charAt(4)).replace('*', estadoAtual.charAt(5)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(4), '*').replace(estadoAtual.charAt(7), estadoAtual.charAt(4)).replace('*', estadoAtual.charAt(7)));
                break;
            }
            case 5: {
                filhos.add(estadoAtual.replace(estadoAtual.charAt(5), '*').replace(estadoAtual.charAt(2), estadoAtual.charAt(5)).replace('*', estadoAtual.charAt(2)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(5), '*').replace(estadoAtual.charAt(4), estadoAtual.charAt(5)).replace('*', estadoAtual.charAt(4)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(5), '*').replace(estadoAtual.charAt(8), estadoAtual.charAt(5)).replace('*', estadoAtual.charAt(8)));
                break;
            }
            case 6: {
                filhos.add(estadoAtual.replace(estadoAtual.charAt(6), '*').replace(estadoAtual.charAt(3), estadoAtual.charAt(6)).replace('*', estadoAtual.charAt(3)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(6), '*').replace(estadoAtual.charAt(7), estadoAtual.charAt(6)).replace('*', estadoAtual.charAt(7)));
                break;

            }
            case 7: {
                filhos.add(estadoAtual.replace(estadoAtual.charAt(7), '*').replace(estadoAtual.charAt(4), estadoAtual.charAt(7)).replace('*', estadoAtual.charAt(4)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(7), '*').replace(estadoAtual.charAt(6), estadoAtual.charAt(7)).replace('*', estadoAtual.charAt(6)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(7), '*').replace(estadoAtual.charAt(8), estadoAtual.charAt(7)).replace('*', estadoAtual.charAt(8)));
                break;
            }
            case 8: {
                filhos.add(estadoAtual.replace(estadoAtual.charAt(8), '*').replace(estadoAtual.charAt(5), estadoAtual.charAt(8)).replace('*', estadoAtual.charAt(5)));
                filhos.add(estadoAtual.replace(estadoAtual.charAt(8), '*').replace(estadoAtual.charAt(7), estadoAtual.charAt(8)).replace('*', estadoAtual.charAt(7)));
                break;
            }
        }
        return filhos;
    }

	public static void printNo(String no) {
		ArrayList<String> nos = new ArrayList<>();

		System.out.println("###########################################################################################################");
		nos.add(String.join("|", String.valueOf(no.charAt(0)), String.valueOf(no.charAt(1)), String.valueOf(no.charAt(2))));
		nos.add(String.join("|", String.valueOf(no.charAt(3)), String.valueOf(no.charAt(4)), String.valueOf(no.charAt(5))));
		nos.add(String.join("|", String.valueOf(no.charAt(6)), String.valueOf(no.charAt(7)), String.valueOf(no.charAt(8))));

		nos.stream().forEach(System.out::println);
	}
}
