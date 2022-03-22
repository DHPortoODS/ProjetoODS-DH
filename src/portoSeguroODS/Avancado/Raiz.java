package portoSeguroODS.Avancado;

import java.math.MathContext;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Raiz extends QuizMatematica implements Calculo {

	// Construtor
	public Raiz() {
		super();
		// Gera números aleatórios entre 2 a 99
		setA(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	@Override
	public void calcularQuiz() {
		System.out.println("Quanto é a raiz quadrada de " + getA() + "?\n");
		// Gera a resposta do sistema convertendo em numero inteiro
		setRespostaCorreta((int) Math.sqrt(getA()));
		// método para avaliar a resposta do usuário e do sistema
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
			// Método que remove vida
			removeVidas();
		}
	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	// Método de calculo de raiz
	@Override
	public void execCalculadora() {
		// âˆša = x
		System.out.println("[ a^b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		while (getcA().intValue() < 0) {
			System.out.println("\nDigite um número positivo!");
			setcA(cA);
		}

		scanner.nextLine();

		// Objeto que limita a quantidade de casas decimais de um bigdecimal
		MathContext mc = new MathContext(6);
		// Gera o resultado do sistema referente a raiz com limitador de casas decimais da calculadora
		setRespostaCorretaCalculadora(getcA().sqrt(mc));

		System.out.println("\nRaiz quadrada de " + getcA() + " = " + getRespostaCorretaCalculadora());
	}

}
