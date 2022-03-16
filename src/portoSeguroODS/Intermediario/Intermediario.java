package portoSeguroODS.Intermediario;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Intermediario extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Intermediario() {
		super();
	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() >= 3 
				&& QuizMatematica.getPontuacao() < 6
				&& QuizMatematica.getVida().size() > 0) {

			System.out.println("\nVidas: " + getVida());

			double multiplicacaoOuDivisao = Math.random() * 2;

			switch ((int) multiplicacaoOuDivisao) {
			case 0:
				this.tipoDeCalculo = new Multiplicacao();
				tipoDeCalculo.calcularQuiz();
				break;

			case 1:
				this.tipoDeCalculo = new Divisao();
				tipoDeCalculo.calcularQuiz();
				break;
			}

			if (((QuizMatematica) tipoDeCalculo).perdeu()) {
				break;
			}

		}

	}

}
