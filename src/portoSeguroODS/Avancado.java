package portoSeguroODS;

public class Avancado extends QuizMatematica implements Perguntas {

	public Avancado() {
		super();
		setA(geradorDeNumeros.ints(1, 2, 10).findFirst().getAsInt());
		setB(geradorDeNumeros.ints(1, 2, 100).findFirst().getAsInt());
	}

	@Override
	public void fazPergunta() {
		System.out.println("\nVidas: " + getVida()); // Imprime a quantidade de vidas

		double potenciaOuRaiz = Math.random() * 2;

		switch ((int) potenciaOuRaiz) {
		case 0:
			System.out.println("Quanto Ã© " + getA() + "²?\n");
			setRespostaCorreta((int) Math.pow(getA(), 2));
			checaResposta();
			break;
		case 1:
			System.out.println("Quanto Ã© √" + getB() + "?\n");
			setRespostaCorreta((int) Math.sqrt(getB()));
			checaResposta();
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
			System.out.println("\nResposta incorreta!" + "\nA resposta Ã©: " + getRespostaCorreta());
			System.out.println("\nVocÃª perdeu uma vida!\n");
			removeVidas();
		}
	}

}
