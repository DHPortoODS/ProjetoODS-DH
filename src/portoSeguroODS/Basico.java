package portoSeguroODS;

public class Basico extends QuizMatematica implements Perguntas {

	// Básico conterá contas de Subtração e Adição
	public Basico() {
		super();
	
	}

	@Override
	public void fazPergunta() {
		
		while (true) {
			System.out.println(getVida()); // Imprime a quantidad de vidas
			if (getA() > getB()) {
				System.out.println("Quanto é " + getA() + " - " + getB() + "?");
				setRespostaCorreta(getA() - getB());
				checaResposta();
				setA(geradorDeNumeros.nextInt(10));
				setB(geradorDeNumeros.nextInt(10));
			} else {
				System.out.println("Quanto é " + getA() + " + " + getB() + "?");
				setRespostaCorreta(getA() + getB());
				checaResposta();
				setA(geradorDeNumeros.nextInt(10));
				setB(geradorDeNumeros.nextInt(10));
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
