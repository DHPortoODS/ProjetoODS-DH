package portoSeguroODS;

public class Avancado extends QuizMatematica implements Perguntas {

	public Avancado() {
		super();
		setA((int) Math.random() * 10 + 1);
		// Gera um numero aleatório entre 1 e 10.
	}

	//Método provindo da interface que irá fazer a pergunta ao usuário
	@Override
	public void fazPergunta() {
		while (true) {
			double potenciaOuRaiz = Math.random() * 2;
			
			/* Gera um numero aleatório: 1 ou 2
			 *  Este número entra no switch case como opção que irá definir se a conta mostrada
			 *  ao usuário será Potência ou Raiz Quadrada
			 */
			
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
			
			if (perdeu()) {
				break;
			} else if (getPontuacao() == 9 && getVida().size() > 0) {
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
