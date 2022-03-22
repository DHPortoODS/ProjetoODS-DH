package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Subtracao extends QuizMatematica implements Calculo {

	// Construtor
	public Subtracao() {
		super();
		// Gera n�meros aleat�rios entre 1 a 20
		setA(geradorDeNumeros.nextInt(20) + 1);
		setB(geradorDeNumeros.nextInt(10) + 1);
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	@Override
	public void calcularQuiz() {
		if (getA() > getB()) {
			System.out.println("\nQuanto � " + getA() + " - " + getB() + "?");
			// Gera a resposta do sistema
			setRespostaCorreta(getA() - getB());
			// M�todo para avaliar a resposta do usu�rio e do sistema
			checarRespostaQuiz();
		} else {
			System.out.println("\nQuanto � " + getB() + " - " + getA() + "?");
			// Gera a resposta do sistema
			setRespostaCorreta(getB() - getA());
			// M�todo para avaliar a resposta do usu�rio e do sistema
			checarRespostaQuiz();
		}
	}

	@Override
	public void checarRespostaQuiz() {
		setRespostaDoUsuario(0);

		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			// M�todo de pontua��o recebe +1
			setPontuacao(1);
			// M�todo para imprimir a pontua��o
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta �: " + getRespostaCorreta());
			System.out.println("\nVoc� perdeu uma vida!\n");
			// M�todo que remove vida
			removeVidas();
		}
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	// M�todo de calculo de subtra��o
	@Override
	public void execCalculadora() {
		// a - b = x
		System.out.println("[ a - b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);

		scanner.nextLine();

		// Gera a resposta do sistema referente a subtra��o da calculadora
		setRespostaCorretaCalculadora(getcA().subtract(getcB()));

		if (getcB().doubleValue() < 0) {
			System.out.println("\n" + getcA() + " - (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " - " + getcB() + " = " + getRespostaCorretaCalculadora());
		}
	}

}
