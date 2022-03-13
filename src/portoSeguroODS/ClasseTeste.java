package portoSeguroODS;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ClasseTeste {

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
		for (int i = 0; i < 10; i++) {

			// Instância das três classes de perguntas
			Basico perguntaBasico = new Basico();
			Intermediario perguntaInter = new Intermediario();
			Avancado perguntaAvanc = new Avancado();

			/*
			 * if vai checar se o perdeu() retorna verdadeiro: caso verdadeiro, significa
			 * que acabou as vidas e o usuário perdeu e ele encerra o programa caso falso,
			 * ele passa para o próximo else if, onde ele vai verificar a pontuação e a vida
			 * para ir para próxima etapa.
			 */

			// Faz a pergunta: Básico
			perguntaBasico.fazPergunta();

			if (perguntaBasico.perdeu()) {
				break;
			} else if (QuizMatematica.getPontuacao() == 3 && QuizMatematica.getVida().size() > 0) {

				perguntaInter.fazPergunta();
				if (perguntaInter.perdeu()) {
					break;
				} else if (QuizMatematica.getPontuacao() == 6 && QuizMatematica.getVida().size() > 0) {

					perguntaAvanc.fazPergunta();
					if (perguntaAvanc.perdeu()) {
						break;
					} else if (QuizMatematica.getPontuacao() == 9 && QuizMatematica.getVida().size() > 0) {
						QuizMatematica.getPontuacao();
						break;
					}
				}
			}

		}

	}

}
