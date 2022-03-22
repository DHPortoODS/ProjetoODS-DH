package portoSeguroODS.Intermediario;

import java.math.RoundingMode;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Divisao extends QuizMatematica implements Calculo {

	// Construtor
	public Divisao() {
		// Gera numeros aleatórios entre 2 a 99
		super();
		setA(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 2, 10).findFirst().getAsInt());
	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	@Override
	public void calcularQuiz() {
		System.out.println("\nQuanto é " + getA() + " / " + getB() + "?");
		// Gera a resposta do sistema
		setRespostaCorreta(getA() / getB());
		// Método para avaliar a resposta do usuário e do sistema
		checarRespostaQuiz();
	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	@Override
	public void checarRespostaQuiz() {
		// Entrada de valor inserido pelo usuario
		setRespostaDoUsuario(0);
		// Condição de comparação com a resposta do usuário e do sistema
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			// Método de pontuação recebe +1
			setPontuacao(1);
			// Método para imprimir a pontuação
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta());
			System.out.println("\nVocê perdeu uma vida!\n");
			// Método que remove vida -1
			removeVidas();
		}

	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	// Método de calculo de divisão
	@Override
	public void execCalculadora() {
		// a / b = x
		System.out.println("[ a / b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);
		while (getcB().doubleValue() == 0) {
			System.out.println("\nO valor de b não pode ser zero!");
			setcB(cB);
		}

		scanner.nextLine();

		// Gera o resultado do sistema referente a divisão com duas casas decimais arredondando o valor para cima da calculadora
		setRespostaCorretaCalculadora(getcA().divide(getcB(), 2, RoundingMode.HALF_UP));

		if (getcB().doubleValue() < 0) {
			System.out.println("\n" + getcA() + " / (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " / " + getcB() + " = " + getRespostaCorretaCalculadora());
		}

	}

}
