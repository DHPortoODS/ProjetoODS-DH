package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Basico extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Basico() {
		super();
	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() < 3 
				&& QuizMatematica.getVida().size() > 0) {

			System.out.println("\nVidas: " + getVida());

			double somaOuSubtracao = Math.random() * 2;

			switch ((int) somaOuSubtracao) {
			case 0:
				this.tipoDeCalculo = new Adicao();
				tipoDeCalculo.calcular();
				break;
			case 1:
				this.tipoDeCalculo = new Subtracao();
				tipoDeCalculo.calcular();
				break;
			}

			if (((QuizMatematica) tipoDeCalculo).perdeu()) {
				break;
			}
		}
	}

}
