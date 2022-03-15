package Avancado;

import portoSeguroODS.Calculo;
import portoSeguroODS.Perguntas;
import portoSeguroODS.QuizMatematica;

public class Avancado extends QuizMatematica implements Perguntas {
	private Calculo tipoDeCalculo;

	public Avancado() {
		super();

	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() >= 6 && QuizMatematica.getPontuacao() < 9
				&& QuizMatematica.getVida().size() > 0) {
			System.out.println("Vidas: " + getVida()); // Imprime a quantidade de vidas

			double potenciaOuRaiz = Math.random() * 2;

			switch ((int) potenciaOuRaiz) {
			case 0:

				this.tipoDeCalculo = new Exponenciacao();
				tipoDeCalculo.calcular();
				break;
			case 1:

				this.tipoDeCalculo = new Raiz();
				tipoDeCalculo.calcular();
				break;
			}

			if (((QuizMatematica) tipoDeCalculo).perdeu()) {
				break;
			}

		}

	}

}
