package portoSeguroODS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuizMatematica {

	// Atributos
	private int a;
	private int b;
	private int respostaCorreta;
	private int respostaDoUsuario;
	private static int pontuacao = 0;
	private static ArrayList<String> vida = new ArrayList<>(Arrays.asList("S2", "S2", "S2"));

	Random geradorDeNumeros = new Random();
	Scanner scanner = new Scanner(System.in);

	public QuizMatematica() {
		this.a = geradorDeNumeros.nextInt(999);
		this.b = geradorDeNumeros.nextInt(999);
	}

	// Getters e Setters dos atritubos: a, b, respostaCorreta, respostaDoUsuario,
	// vida e pontuações*
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(int respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public int getRespostaDoUsuario() {
		return respostaDoUsuario;
	}

	public void setRespostaDoUsuario(int respostaDoUsuario) {
		this.respostaDoUsuario = (int) scanner.nextDouble();
		/*
		 * UtilizaÃ§Ã£o do Scanner na resposta do usuÃ¡rio A resposta muitas vezes poderÃ¡
		 * ter casas decimais, entÃ£o o scanner lÃª o valor em double e faz o cast
		 * (converte) para o tipo inteiro

		 */
	}

	public static int getPontuacao() {
		return pontuacao;
	}

	public static void setPontuacao(int pontuacao) {
		QuizMatematica.pontuacao += pontuacao;
	}

	public static ArrayList<String> getVida() {
		return vida;
	}

	public static void setVida(ArrayList<String> vida) {
		QuizMatematica.vida = vida;

	}

	public void removeVidas(){
		getVida().remove(getVida().size() - 1);
		System.out.println(getVida());
	}	

	
	
	
	
	
	//Função para quando perder 3 vezes no módulo básico
	public boolean perdeuBasico() {
		if (getVida().size() == 0) {
			System.out.println("Pontuação: " + getPontuacao());
			System.out.println("\nVocê precisa estudar mais. \nAcesse esse link: https://www.youtube.com/watch?v=AUzyuZdg68Y&ab_channel=ProfessoraAlineSantana \ne esse outro link: "
					+ "https://trilhante.com.br/curso/operacoes-basicas/aula/operacoes-basicas-adicao-subtracao-multiplicacao-e-divisao#:~:text=A%20ADI%C3%87%C3%83O%20pode%20ser%20entendida,somado%20com%20um%20n%C3%BAmero%20POSITIVO.");
			return true;
		} else {
			return false;
		}

	}
	
	
	//Função para quando perder 3 vezes no módulo Intermediário
		public boolean perdeuIntermediario() {
			if (getVida().size() == 0) {
				System.out.println("Pontuação: " + getPontuacao());
				System.out.println("\nVocê precisa estudar mais. \nAcesse esse link: https://www.youtube.com/watch?v=GsHAXCgbhm4&ab_channel=Matem%C3%A1ticaF%C3%A1cil \ne esse outro link: "
						+ "https://mundoeducacao.uol.com.br/matematica/multiplicacao.htm e https://brasilescola.uol.com.br/matematica/divisao.htm");
				return true;
			} else {
				return false;
			}

		}
	

		
		//Função para quando perder 3 vezes no módulo Avançado
		public boolean perdeuAvancado() {
			if (getVida().size() == 0) {
				System.out.println("Pontuação: " + getPontuacao());
				System.out.println("\nVocê precisa estudar mais. \\nAcesse esse link: https://www.youtube.com/watch?v=P1HdAS_nBHE \ne "
						+ "esse outro link: https://www.todamateria.com.br/potenciacao-e-radiciacao/");
				return true;
			} else {
				return false;
			}

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void mostreAPontuacao() {
		System.out.println("\nSua pontuação de: " + getPontuacao() + "\n");
	}
	
}
