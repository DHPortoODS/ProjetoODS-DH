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
	private static ArrayList<String> vida = new ArrayList<>(Arrays.asList("♥", "♥", "♥"));

	Random geradorDeNumeros = new Random();
	Scanner scanner = new Scanner(System.in);

	public QuizMatematica() {
		this.a = geradorDeNumeros.nextInt(10);
		this.b = geradorDeNumeros.nextInt(10);
	}

	// Getters e Setters dos atritubos: a, b, respostaCorreta, respostaDoUsuario,
	// vida e pontuaÃ§Ãµes*
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
		 * UtilizaÃ§Ã£o do Scanner na resposta do usuÃ¡rio A resposta muitas vezes
		 * poderÃ¡ ter casas decimais, entÃ£o o scanner lÃª o valor em double e faz o
		 * cast (converte) para o tipo inteiro
		 * 
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

	public void removeVidas() {
		getVida().remove(getVida().size() - 1);
	}

	public boolean perdeu() {
		if (getVida().size() == 0) {
			System.out.println("GAME OVER");
			System.out.println("Pontuação: " + getPontuacao());
			return true;
		} else {
			return false;
		}
	}

	public void mostreAPontuacao() {
		System.out.println("\nSua pontuação é de: " + getPontuacao() + "\n");
	}

}
