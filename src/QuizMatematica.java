package portoSeguroODS;

import java.util.Random;
import java.util.Scanner;

public class QuizMatematica {

	//Atributos
	private int a;
	private int b;
	private int respostaCorreta;
	private int respostaDoUsuario;
	private static int pontuacaoBasico = 0;
	private static int pontuacaoIntermediario = 0;
	private static int pontuacaoAvancado = 0;
	private String vida = "♥ ♥ ♥";
	
	Random geradorDeNumeros = new Random();
	Scanner scanner = new Scanner(System.in);
	
	public QuizMatematica() {
		this.a = geradorDeNumeros.nextInt(999);
		this.b = geradorDeNumeros.nextInt(999);
	}

	
	//Getters e Setters dos atritubos: a, b, respostaCorreta, respostaDoUsuario, vida e pontuacoes*
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
		this.respostaDoUsuario = scanner.nextInt();
	}

	public static int getPontuacaoBasico() {
		return pontuacaoBasico;
	}

	public static void setPontuacaoBasico(int pontuacaoBasico) {
		QuizMatematica.pontuacaoBasico += pontuacaoBasico;
	}

	public static int getPontuacaoIntermediario() {
		return pontuacaoIntermediario;
	}

	public static void setPontuacaoIntermediario(int pontuacaoIntermediario) {
		QuizMatematica.pontuacaoIntermediario = pontuacaoIntermediario;
	}

	public static int getPontuacaoAvancado() {
		return pontuacaoAvancado;
	}

	public static void setPontuacaoAvancado(int pontuacaoAvancado) {
		QuizMatematica.pontuacaoAvancado = pontuacaoAvancado;
	}

	public String getVida() {
		return vida;
	}

	public void setVida(String vida) {
		this.vida = vida;
	}
	
	
	
}
