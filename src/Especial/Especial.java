package Especial;


import portoSeguroODS.Calculo;
import portoSeguroODS.Perguntas;
import portoSeguroODS.QuizMatematica;

public class Especial extends QuizMatematica implements Perguntas {
	private Calculo tipoDeCalculo;

	public Especial() {
		super();
	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() == 9 
				&& QuizMatematica.getVida().size() > 0) {
			double escolhaAleatoria = Math.random() * 2;

			System.out.println("\nVidas: " + getVida());

			switch ((int) escolhaAleatoria) {
			case 0:
				this.tipoDeCalculo = new CalculoEspecial1();
				tipoDeCalculo.calcular();
				break;
			case 1:
				this.tipoDeCalculo = new CalculoEspecial2();
				tipoDeCalculo.calcular();
				break;
			}
			if (((QuizMatematica) tipoDeCalculo).perdeuEspecial()) {
				break;
			}
		}

	}

}