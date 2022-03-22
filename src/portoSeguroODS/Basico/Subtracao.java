package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Subtracao extends QuizMatematica implements Calculo {

	// Construtor
	public Subtracao() {
		super();
		// Gera números aleatórios entre 1 a 20
		setA(geradorDeNumeros.nextInt(20) + 1);
		setB(geradorDeNumeros.nextInt(10) + 1);
	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	@Override
	public void calcularQuiz() {
		if (getA() > getB()) {
			System.out.println("\nQuanto é " + getA() + " - " + getB() + "?");
			// Gera a resposta do sistema
			setRespostaCorreta(getA() - getB());
			// Método para avaliar a resposta do usuário e do sistema
			checarRespostaQuiz();
		} else {
			System.out.println("\nQuanto é " + getB() + " - " + getA() + "?");
			// Gera a resposta do sistema
			setRespostaCorreta(getB() - getA());
			// Método para avaliar a resposta do usuário e do sistema
			checarRespostaQuiz();
		}
	}

	@Override
	public void checarRespostaQuiz() {
		setRespostaDoUsuario(0);

		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			// Método de pontuação recebe +1
			setPontuacao(1);
			// Método para imprimir a pontuação
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta());
			System.out.println("\nVocê perdeu uma vida!\n");
			// Método que remove vida
			removeVidas();
		}
	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	// Método de calculo de subtração
	@Override
	public void execCalculadora() {
		// a - b = x
		System.out.println("[ a - b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);

		scanner.nextLine();

		// Gera a resposta do sistema referente a subtração da calculadora
		setRespostaCorretaCalculadora(getcA().subtract(getcB()));

		if (getcB().doubleValue() < 0) {
			System.out.println("\n" + getcA() + " - (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " - " + getcB() + " = " + getRespostaCorretaCalculadora());
		}
	}

}
