package br.com.buscaemprofundidade.busca;

import java.util.List;
import java.util.Stack;

import br.com.buscaemprofundidade.entity.No;
import br.com.buscaemprofundidade.utils.NoUtils;

public class BuscaEmProfundidade {

	private No no;
	private String objetivo;

	public BuscaEmProfundidade(No no, String objetivo) {
		this.no = no;
		this.objetivo = objetivo;
	}

	public String busca() {
		No noRaiz = new No(no.getEstado());
		int totalDeNosVisitados = 0;
		Stack<String> fechados = new Stack<>();
		Stack<No> abertos = new Stack<>();

		abertos.add(noRaiz);

		NoUtils.printNo(noRaiz.getEstado());

		while (!abertos.isEmpty()) {
			totalDeNosVisitados++;
			No x = abertos.pop();

			if (x.getEstado().equals(objetivo)) {
				System.out.println("Sucesso");
				System.out.println(totalDeNosVisitados);
				break;
			} else {
				List<String> nosFilhos = NoUtils.gerarFilhos(x.getEstado());
				fechados.add(x.getEstado());

				for (String filho : nosFilhos) {
					if (fechados.contains(filho) || abertos.contains(filho))
						continue;
					fechados.add(filho);
					No noFilho = new No(filho);
					x.addFilhos(noFilho);
					noFilho.setNoPai(x);
					abertos.add(noFilho);
					NoUtils.printNo(noFilho.getEstado());
				}
			}
		}
		
		return "Falha";
	}

	public No getNo() {
		return no;
	}

	public void setNo(No no) {
		this.no = no;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
}
