package portoSeguroODS.Avancado;

import java.math.RoundingMode;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Exponenciacao extends QuizMatematica implements Calculo {

	// Contrutor
	public Exponenciacao() {
		super();
		// Gera números aleatórios entre 2 a 10
		setA(geradorDeNumeros.ints(1, 2, 11).findFirst().getAsInt());
	}

	// Polimorfismo - Sobrescreve o método da interface Calculo
	@Override
	public void calcularQuiz() {
		System.out.println("Quanto é " + getA() + "²?");
		// Gera a resposta do sistema convertendo em numero inteiro
		setRespostaCorreta((int) Math.pow(getA(), 2));
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
	// Método de calculo de exponenciação
	@Override
	public void execCalculadora() {
		// a ^ b = x
		System.out.println("[ a ^ b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);
		while (getcB().doubleValue() != getcB().intValue()) {
			System.out.println("\nDigite um número inteiro!");
			setcB(cB);
		}

		scanner.nextLine();

		// Gera a resposta do sistema referente a exponenciação da calculadora
		setRespostaCorretaCalculadora(getcA().pow(getcB().intValue()));

		// Tratamento transforma o valor de getcB do tipo bigDecimal em double e compara
		// se é menor que 0
		if (getcB().doubleValue() < 0) {
			System.out.println("\n" + getcA() + " ^ (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " ^ " + getcB() + " = " + getRespostaCorretaCalculadora());
		}

	}

}
