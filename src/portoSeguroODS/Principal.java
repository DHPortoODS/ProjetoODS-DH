package portoSeguroODS;

import portoSeguroODS.Basico.Basico;

public class Principal {

	public static void main(String[] args) {

		// QuizMatematica.perguntaNome();

		// Básico
		Basico basico = new Basico();
		basico.fazerQuiz();
		
		
		/*
		 * // Intermediário if (QuizMatematica.getPontuacao() == 3) {
		 * System.out.println("\n\n\nParabéns, você avançou para a próxima etapa!" +
		 * "\nAgora as perguntas são de nível Intermediário.\n"); }
		 * 
		 * for (int i = 0; i < 10; i++) { while (QuizMatematica.getPontuacao() >= 3 &&
		 * QuizMatematica.getPontuacao() < 6 && QuizMatematica.getVida().size() > 0) {
		 * 
		 * Intermediario perguntaInter = new Intermediario();
		 * 
		 * perguntaInter.fazPergunta();
		 * 
		 * if (perguntaInter.perdeu()) { perguntaInter.perdeuIntermediario(); break; } }
		 * }
		 * 
		 * // Avançado if (QuizMatematica.getPontuacao() == 6) {
		 * System.out.println("\n\n\nParabéns, você avançou para a próxima etapa!" +
		 * "\nAgora as perguntas são de nível Avançado.\n"); }
		 * 
		 * for (int i = 0; i < 10; i++) { while (QuizMatematica.getPontuacao() >= 6 &&
		 * QuizMatematica.getPontuacao() < 9 && QuizMatematica.getVida().size() > 0) {
		 * 
		 * Avancado perguntaAvanc = new Avancado();
		 * 
		 * perguntaAvanc.fazPergunta();
		 * 
		 * if (perguntaAvanc.perdeu()) { perguntaAvanc.perdeuAvancado(); break; } } }
		 * 
		 * // Esoecial if (QuizMatematica.getPontuacao() == 9) {
		 * System.out.println("\n\n\nParabéns, você avançou para a etapa final!" +
		 * "\nResponda a esta pergunta especial: \n"); }
		 * 
		 * for (int i = 0; i < 10; i++) { while (QuizMatematica.getPontuacao() == 9 &&
		 * QuizMatematica.getVida().size() > 0) {
		 * 
		 * Especial perguntaEspec = new Especial();
		 * 
		 * perguntaEspec.fazPergunta(); if (QuizMatematica.getVida().size() == 0) {
		 * perguntaEspec.perdeu(); break; } } }
		 */	}
}
