package portoSeguroODS;

public class Basico extends QuizMatematica implements Perguntas {

	// Básico conterá contas de Subtração e Adição
	public Basico() {
		super();
		setA(geradorDeNumeros.nextInt(10) + 1);
		setB(geradorDeNumeros.nextInt(10) + 1);
	}

	@Override
	public void fazPergunta() {
		System.out.println(getVida()); // Imprime a quantidade de vidas

		double somaOuSubtracao = Math.random() * 2;

		switch ((int) somaOuSubtracao) {
		case 0:
			System.out.println("\nQuanto é " + getA() + " + " + getB() + "?");
			setRespostaCorreta(getA() + getB());
			checaResposta();
			break;

		case 1:
			if (getA() > getB()) {
				System.out.println("\nQuanto é " + getA() + " - " + getB() + "?");
				setRespostaCorreta(getA() - getB());
				checaResposta();
			} else {
				System.out.println("\nQuanto é " + getB() + " - " + getA() + "?");
				setRespostaCorreta(getB() - getA());
				checaResposta();
			}
			break;
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
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta() + "\n");
			System.out.println("\nVocê perdeu uma vida: ");
			removeVidas();
		}
	}

}
