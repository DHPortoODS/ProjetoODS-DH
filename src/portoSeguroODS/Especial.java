package portoSeguroODS;

public class Especial extends QuizMatematica implements PerguntaQuiz, Calculo {

	public Especial() {
		super();
		setA(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setC(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setD(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
	}

	@Override
	public void fazerQuiz() {
		while (QuizMatematica.getPontuacao() == 9 
				&& QuizMatematica.getVida().size() > 0) {

			System.out.println("\nVidas: " + getVida());

			calcular();

			if (perdeu()) {
				break;
			}
		}
	}

	@Override
	public void calcular() {

		if (getA() > getB()) {
			System.out.println("Qual é o resultado desta operação: ");
			// a² + (a - b) x (c + d) + √4
			System.out.println(getA() + "² + (" 
					+ getA() + " - " + getB() + ") x (" 
					+ getC() + "+" + getD() + ") + √4?");

			setRespostaCorreta((int) Math.pow(getA(), 2) + (getA() - getB()) * (getC() + getD()) + (int) Math.sqrt(4));

			checarResposta();
		} else {
			System.out.println("Qual é o resultado desta operação: ");
			// a² + (b - a) x (c + d) + √9
			System.out.println(getA() + "² + (" 
					+ getB() + " - " + getA() + ") x (" 
					+ getC() + "+" + getD() + ") + √9?");

			setRespostaCorreta((int) Math.pow(getA(), 2) + (getB() - getA()) * (getC() + getD()) + (int) Math.sqrt(9));

			checarResposta();
		}
	}

	@Override
	public void checarResposta() {
		setRespostaDoUsuario(0); // Scanner do Usuário

		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacao(1);
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta());
			System.out.println("\nVocê perdeu uma vida!\n");
			removeVidas();
		}
	}
}