package portoSeguroODS.Avancado;

import java.math.MathContext;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Raiz extends QuizMatematica implements Calculo {

	// Construtor
	public Raiz() {
		super();
		// Gera n�meros aleat�rios entre 2 a 99
		setA(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	@Override
	public void calcularQuiz() {
		System.out.println("Quanto � a raiz quadrada de " + getA() + "?\n");
		// Gera a resposta do sistema convertendo em numero inteiro
		setRespostaCorreta((int) Math.sqrt(getA()));
		// m�todo para avaliar a resposta do usu�rio e do sistema
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
			// M�todo que remove vida
			removeVidas();
		}
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	// M�todo de calculo de raiz
	@Override
	public void execCalculadora() {
		// √a = x
		System.out.println("[ a^b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		while (getcA().intValue() < 0) {
			System.out.println("\nDigite um n�mero positivo!");
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
