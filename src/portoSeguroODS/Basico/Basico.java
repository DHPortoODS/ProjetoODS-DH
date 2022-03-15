package Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.Perguntas;
import portoSeguroODS.QuizMatematica;

public class Basico extends QuizMatematica implements Perguntas {

	private Calculo tipoDeCalculo;

	// Básico conterá contas de Subtração e Adição
	public Basico() {
		super();
	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() < 3 && QuizMatematica.getVida().size() > 0) {
			// Imprime a quantidade de vidas
			System.out.println("Vidas: " + getVida());

			double escolhaAleatoria = Math.random() * 2;

			switch ((int) escolhaAleatoria) {
			case 0:
				this.tipoDeCalculo = new Adicao();
				tipoDeCalculo.calcular();
				break;
			case 1:
				this.tipoDeCalculo = new Subtracao();
				tipoDeCalculo.calcular();
				break;
			}

			if (((QuizMatematica) tipoDeCalculo).perdeuEspecial()) {
				break;
			}
		}
	}

}
