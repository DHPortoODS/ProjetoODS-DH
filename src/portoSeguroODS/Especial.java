package portoSeguroODS;

public class Especial extends QuizMatematica implements PerguntaQuiz, Calculo {

	public Especial() {
		super();
		setA(geradorDeNumeros.ints(1, 1, 20).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 1, 20).findFirst().getAsInt());
		setC(geradorDeNumeros.ints(1, 1, 20).findFirst().getAsInt());
		setD(geradorDeNumeros.ints(1, 1, 20).findFirst().getAsInt());
	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() == 9 
				&& QuizMatematica.getVida().size() > 0) {

			System.out.println("\nVidas: " + getVida());

			calcularQuiz();

			if (perdeu()) {
				break;
			}
		}
	}

	@Override
	public void calcularQuiz() {

		if (getA() > getB()) {
			System.out.println("Qual é o resultado desta operação: ");
			// a² + (a - b) x (c + d) + √4
			System.out.println(getA() + "² + (" 
					+ getA() + " - " + getB() + ") x (" 
					+ getC() + "+" + getD() + ") + √4?");

			setRespostaCorreta((int) Math.pow(getA(), 2) + (getA() - getB()) * (getC() + getD()) + (int) Math.sqrt(4));
			System.out.println(getRespostaCorreta());
			
			checarRespostaQuiz();
		} else {
			System.out.println("Qual é o resultado desta operação: ");
			// a² + (b - a) x (c + d) + √9
			System.out.println(getA() + "² + (" 
					+ getB() + " - " + getA() + ") x (" 
					+ getC() + "+" + getD() + ") + √9?");

			setRespostaCorreta((int) Math.pow(getA(), 2) + (getB() - getA()) * (getC() + getD()) + (int) Math.sqrt(9));
			System.out.println(getRespostaCorreta());

			checarRespostaQuiz();
		}
	}

	@Override
	public void checarRespostaQuiz() {
		setRespostaDoUsuario(0); // Scanner do Usuário

		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacao(1);
			mostreAPontuacao();
			parabens();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta());
			System.out.println("\nVocê perdeu uma vida!\n");
			removeVidas();
		}
	}

	@Override
	public void execCalculadora() {
	}
}