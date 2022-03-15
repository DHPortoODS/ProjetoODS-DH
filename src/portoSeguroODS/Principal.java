package portoSeguroODS;

import portoSeguroODS.Basico.Basico;

public class Principal {

	public static void main(String[] args) {

		// QuizMatematica.perguntaNome();

		// Básico
		Basico basico = new Basico();
		basico.fazerQuiz();
		
		Intermediario intermediario = new Intermediario();
		intermediario.fazerQuiz();
		
		Intermediario avancado = new Avancado();
		intermediario.fazerQuiz();
		}
}
