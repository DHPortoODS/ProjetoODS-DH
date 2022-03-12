package portoSeguroODS;

public class Basico extends QuizMatematica implements Perguntas {

	public Basico() {
		super();
	}

	@Override
	public void fazPergunta() {
		while (true) {
			
			setA(geradorDeNumeros.nextInt(999));
			setB(geradorDeNumeros.nextInt(999));

			double somaOuSubtracao = Math.random() * 2;

			System.out.println(getVida()); // Imprime a quantidad de vidas

			switch ((int) somaOuSubtracao) {
			case 0:
				System.out.println("\nQuanto é " + getA() + " + " + getB() + "?");
				setRespostaCorreta(getA() + getB());
				checaResposta();
				mostreAPontuacao();
				break;

			case 1:
				if (getA() > getB()) {
					System.out.println("\nQuanto é " + getA() + " - " + getB() + "?");
					setRespostaCorreta(getA() - getB());
					checaResposta();
					mostreAPontuacao();
				} else {
					System.out.println("\nQuanto é " + getB() + " - " + getA() + "?");
					setRespostaCorreta(getB() - getA());
					checaResposta();
					mostreAPontuacao();
				}
				break;
			}

			/*if vai checar se o perdeu() retorna verdadeiro:
			 * caso verdadeiro, significa que acabou as vidas e o usuário perdeu e ele encerra o programa
			 * caso falso, ele passa para o próximo else if, onde ele vai verificar a pontuação
			 * e a vida para ir para próxima etapa.
			 */
			if (perdeu()) {
				break;
			} else if (getPontuacao() == 3 && getVida().size() > 0) {
				getPontuacao();
				break;
			}
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
