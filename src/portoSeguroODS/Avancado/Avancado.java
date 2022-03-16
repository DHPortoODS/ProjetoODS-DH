package portoSeguroODS.Avancado;

import portoSeguroODS.Calculo;
import portoSeguroODS.PerguntaQuiz;
import portoSeguroODS.QuizMatematica;

public class Avancado extends QuizMatematica implements PerguntaQuiz {

	private Calculo tipoDeCalculo;

	public Avancado() {
		super();
	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() >= 6 
				&& QuizMatematica.getPontuacao() < 9
				&& QuizMatematica.getVida().size() > 0) {

			System.out.println("\nVidas: " + getVida());

			double potenciaOuRaiz = Math.random() * 2;

			switch ((int) potenciaOuRaiz) {
			case 0:

				this.tipoDeCalculo = new Exponenciacao();
				tipoDeCalculo.calcularQuiz();
				break;
			case 1:

				this.tipoDeCalculo = new Raiz();
				tipoDeCalculo.calcularQuiz();
				break;
			}

			if (((QuizMatematica) tipoDeCalculo).perdeu()) {
				break;
			}

		}

	}

}
