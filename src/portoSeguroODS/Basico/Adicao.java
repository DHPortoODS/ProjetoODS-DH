package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Adicao extends QuizMatematica implements Calculo {

	// Construtor
	public Adicao() {
		super();
		// Gera números aleatórios entre 1 a 20
		setA(geradorDeNumeros.nextInt(20) + 1);
		setB(geradorDeNumeros.nextInt(10) + 1);
	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	@Override
	public void calcularQuiz() {
		System.out.println("\nQuanto é " + getA() + " + " + getB() + "?");
		// Gera a resposta do sistema
		setRespostaCorreta(getA() + getB());
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
	// Método de calculo de soma
	@Override
	public void execCalculadora() {
		// a + b = x
		System.out.println("[ a + b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);

		scanner.nextLine();

		// Gera o resultado do sistema referenta a soma da calculadora
		setRespostaCorretaCalculadora(getcA().add(getcB()));

		System.out.println("\n" + getcA() + " + " + getcB() + " = " + getRespostaCorretaCalculadora());
	}

}
