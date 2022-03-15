package Intermediario;

import portoSeguroODS.Calculo;
import portoSeguroODS.Perguntas;
import portoSeguroODS.QuizMatematica;

public class Intermediario extends QuizMatematica implements Perguntas {
	private Calculo tipoDeCalculo;
	
	public static void main(String[] args) {
		
	}

	public Intermediario() {
		super();
	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() >= 3 && QuizMatematica.getPontuacao() < 6
				&& QuizMatematica.getVida().size() > 0) {

			System.out.println("Vidas: " + getVida());

			double escolhaAleatória = Math.random() * 2;

			switch ((int) escolhaAleatória) {
			case 0:
				this.tipoDeCalculo = new Multiplicacao();
				tipoDeCalculo.calcular();
				break;

			case 1:
				this.tipoDeCalculo = new Divisao();
				tipoDeCalculo.calcular();
				break;
			}
			
			if(((QuizMatematica)tipoDeCalculo).perdeu()) {
				break;
			}

		}

	}



}
