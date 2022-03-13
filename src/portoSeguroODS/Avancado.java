package portoSeguroODS;

public class Avancado extends QuizMatematica implements Perguntas {

	public Avancado() {
		super();
		setA((int) Math.random() * 10 + 1); // Gera um numero aleatório entre 1 e 10.
	}

	@Override
	public void fazPergunta() {
		System.out.println(getVida()); // Imprime a quantidade de vidas

		double potenciaOuRaiz = Math.random() * 2;

		switch ((int) potenciaOuRaiz) {
		case 0:
			System.out.println("Quanto é " + getA() + " ao quadrado?\n");
			setRespostaCorreta((int) Math.pow(getA(), 2));
			checaResposta();
			break;
		case 1:
			System.out.println("Quanto é a raiz quadrada de " + getA() + "?\n");
			setRespostaCorreta((int) Math.sqrt(getA()));
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
			System.out.println("\nResposta incorreta!" + "\nA resposta é: " + getRespostaCorreta() + "\n");
			System.out.println("\nVocê perdeu uma vida: ");
			removeVidas();
		}
	}

}
