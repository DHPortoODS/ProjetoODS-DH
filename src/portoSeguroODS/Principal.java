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

		// Básico
		for (int i = 0; i < 10; i++) {
			while (QuizMatematica.getPontuacao() < 3 
					&& QuizMatematica.getVida().size() > 0) {
				
				Basico perguntaBasico = new Basico();

				perguntaBasico.fazPergunta();

				if (perguntaBasico.perdeu()) {
					break;
				}
			}
		}

		// Intermediário
		if (QuizMatematica.getPontuacao() == 3) {
			System.out.println("\n\n\nParabéns, você avançou para a próxima etapa!"
					+ "\nAgora as perguntas são de nível Intermediário.\n");
		}

		for (int i = 0; i < 10; i++) {
			while (QuizMatematica.getPontuacao() >= 3 
					&& QuizMatematica.getPontuacao() < 6
					&& QuizMatematica.getVida().size() > 0) {

				Intermediario perguntaInter = new Intermediario();

				perguntaInter.fazPergunta();

				if (perguntaInter.perdeu()) {
					break;
				}
			}
		}
		
		// Avançado
		if (QuizMatematica.getPontuacao() == 6) {
			System.out.println("\n\n\nParabéns, você avançou para a próxima etapa!"
					+ "\nAgora as perguntas são de nível Avançado.\n");
		}

		for (int i = 0; i < 10; i++) {
			while (QuizMatematica.getPontuacao() >= 6 
					&& QuizMatematica.getPontuacao() < 9
					&& QuizMatematica.getVida().size() > 0) {

				Avancado perguntaAvanc = new Avancado();

				perguntaAvanc.fazPergunta();
				
				if (perguntaAvanc.perdeu()) {
					break;
				}
			}
		}

		// Esoecial
		if (QuizMatematica.getPontuacao() == 9) {
			System.out.println("\n\n\nParabéns, você avançou para a etapa final!" 
					+ "\nResponda a esta pergunta especial: \n");
		}

		for (int i = 0; i < 10; i++) {
			while (QuizMatematica.getPontuacao() == 9 
					&& QuizMatematica.getVida().size() > 0) {

				Especial perguntaEspec = new Especial();
				
				perguntaEspec.fazPergunta();
				if (QuizMatematica.getVida().size() == 0) {
					perguntaEspec.perdeu();
					break;
				}
			}
		}
	}
}