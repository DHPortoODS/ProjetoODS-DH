package portoSeguroODS.Basico;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Adicao extends QuizMatematica implements Calculo {

	// Construtor
	public Adicao() {
		super();
		// Gera n�meros aleat�rios entre 1 a 20
		setA(geradorDeNumeros.nextInt(20) + 1);
		setB(geradorDeNumeros.nextInt(10) + 1);
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	@Override
	public void calcularQuiz() {
		System.out.println("\nQuanto � " + getA() + " + " + getB() + "?");
		// Gera a resposta do sistema
		setRespostaCorreta(getA() + getB());
		// M�todo para avaliar a resposta do usu�rio e do sistema
		checarRespostaQuiz();
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	@Override
	public void checarRespostaQuiz() {
		// Entrada de valor inserido pelo usuario
		setRespostaDoUsuario(0);
		// Condi��o de compara��o com a resposta do usu�rio e do sistema
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			// M�todo de pontua��o recebe +1
			setPontuacao(1);
			// M�todo para imprimir a pontua��o
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta �: " + getRespostaCorreta());
			System.out.println("\nVoc� perdeu uma vida!\n");
			// M�todo que remove vida -1
			removeVidas();
		}
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	// M�todo de calculo de soma
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
