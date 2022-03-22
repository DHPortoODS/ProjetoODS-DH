package portoSeguroODS.Avancado;

import java.math.RoundingMode;

import portoSeguroODS.Calculo;
import portoSeguroODS.QuizMatematica;

public class Exponenciacao extends QuizMatematica implements Calculo {

	// Contrutor
	public Exponenciacao() {
		super();
		// Gera n�meros aleat�rios entre 2 a 10
		setA(geradorDeNumeros.ints(1, 2, 11).findFirst().getAsInt());
	}

	// Polimorfismo - Sobrescreve o m�todo da interface Calculo
	@Override
	public void calcularQuiz() {
		System.out.println("Quanto � " + getA() + "�?");
		// Gera a resposta do sistema convertendo em numero inteiro
		setRespostaCorreta((int) Math.pow(getA(), 2));
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
	// M�todo de calculo de exponencia��o
	@Override
	public void execCalculadora() {
		// a ^ b = x
		System.out.println("[ a ^ b ]");
		System.out.println("\nDigite o valor de a: ");
		setcA(cA);

		System.out.println("\nDigite o valor de b: ");
		setcB(cB);
		while (getcB().doubleValue() != getcB().intValue()) {
			System.out.println("\nDigite um n�mero inteiro!");
			setcB(cB);
		}

		scanner.nextLine();

		// Gera a resposta do sistema referente a exponencia��o da calculadora
		setRespostaCorretaCalculadora(getcA().pow(getcB().intValue()));

		// Tratamento transforma o valor de getcB do tipo bigDecimal em double e compara
		// se � menor que 0
		if (getcB().doubleValue() < 0) {
			System.out.println("\n" + getcA() + " ^ (" + getcB() + ") = " + getRespostaCorretaCalculadora());
		} else {
			System.out.println("\n" + getcA() + " ^ " + getcB() + " = " + getRespostaCorretaCalculadora());
		}

	}

}
