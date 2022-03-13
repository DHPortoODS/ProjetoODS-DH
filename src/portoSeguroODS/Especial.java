package portoSeguroODS;

public class Especial extends QuizMatematica implements Perguntas {

	public Especial() {
		super();
		setA(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setC(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
		setD(geradorDeNumeros.ints(1, 1, 10).findFirst().getAsInt());
	}

	@Override
	public void fazPergunta() {
		System.out.println(getVida());
		if (getA() > getB()) {
			System.out.println("Qual é o resultado desta operação: ");
			System.out.println(getA() + "² + (" + getA() + " - " + getB() + ") x (" + getC() + "+" + getD() + ") + √4?");
			setRespostaCorreta((int) Math.pow(getA(), 2) + (getA() - getB()) * (getC() + getD()));
			checaResposta();
		} else {
			System.out.println("Qual é o resultado desta operação: ");
			System.out.println(getA() + "² + (" + getB() + " - " + getA() + ") x (" + getC() + "+" + getD() + ") + √9?");
			setRespostaCorreta((int) Math.pow(getA(), 2) + (getB() - getA()) * (getC() + getD()));
			checaResposta();
		}

	}

	@Override
	public void checaResposta() {
		setRespostaDoUsuario(0);
		if (getRespostaCorreta() == getRespostaDoUsuario()) {
			System.out.println("\nReposta correta!");
			setPontuacao(1);
			mostreAPontuacao();
		} else {
			System.out.println("\nResposta incorreta!" + "\nA resposta Ã©: " + getRespostaCorreta() + "\n");
			System.out.println("\nVocÃª perdeu uma vida: ");
			removeVidas();
		}

	}

}