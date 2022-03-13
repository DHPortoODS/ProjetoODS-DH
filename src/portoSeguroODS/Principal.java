package portoSeguroODS;

import java.awt.EventQueue;

public class Principal {

	public static void main(String[] args) {

		// Abre a interface para perguntar o nome
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// Loop que irá rodar as perguntas
		// for (int i = 0; i < 11; i++) {

		// Instância das três classes de perguntas

		//
		//
		//

		/*
		 * if vai checar se o perdeu() retorna verdadeiro: caso verdadeiro, significa
		 * que acabou as vidas e o usuário perdeu e ele encerra o programa caso falso,
		 * ele passa para o próximo else if, onde ele vai verificar a pontuação e a vida
		 * para ir para próxima etapa.
		 */

		// Faz a pergunta: Básico

		while (QuizMatematica.getPontuacao() < 3 && QuizMatematica.getVida().size() > 0) {
			for (int i = 0; i < 3; i++) {
				Basico perguntaBasico = new Basico();
				perguntaBasico.fazPergunta();

				if (perguntaBasico.perdeu()) {
					break;
				}
			}
		}

		System.out.println("\n\nParabéns, você avançou para a próxima etapa!"
				+ "\nAgora as perguntas são de nível Intermediário.\n");

		while (QuizMatematica.getPontuacao() == 3 && QuizMatematica.getPontuacao() < 6) {
			for (int i = 0; i < 3; i++) {
				Intermediario perguntaInter = new Intermediario();
				// Faz a pergunta: Intermediário
				perguntaInter.fazPergunta();

				if (perguntaInter.perdeu()) {
					break;
				}
			}
		}

		System.out.println(
				"\n\nParabéns, você avançou para a próxima etapa!" + "\nAgora as perguntas são de nível Avançado.\n");

		while (QuizMatematica.getPontuacao() == 6 && QuizMatematica.getPontuacao() < 9) {
			for (int i = 0; i < 3; i++) {
				Avancado perguntaAvanc = new Avancado();
				// Faz a pergunta: Avançado
				perguntaAvanc.fazPergunta();
				if (perguntaAvanc.perdeu()) {
					break;
				}
			}
		}

		System.out.println("\n\nParabéns, você avançou para a etapa final!"
				+ "\nResponda a esta pergunta especial: \n");

		while (QuizMatematica.getPontuacao() == 9 && QuizMatematica.getVida().size() > 0) {
			for (int i = 0; i < 3; i++) {
				Especial perguntaEspec = new Especial();
				// Faz a pergunta: Especial
				perguntaEspec.fazPergunta();
				if (QuizMatematica.getVida().size() == 0) {
					perguntaEspec.perdeu();
					break;
				}
			}
		}
	}

}
