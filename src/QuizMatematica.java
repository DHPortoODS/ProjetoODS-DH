import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizMatematica {

	private int a;
	
	private int b;
	
	private double c;
	
	private double d;
	
	private int resultado;
	
	private int resposta;
	
	private double resp;
	
	private static int pontucao;
	
	private static ArrayList<String> vida = new ArrayList<>();
	
	Random numero = new Random();
	
	Scanner leia = new Scanner(System.in);
	
	QuizMatematica(){
		this.a = numero.nextInt(10)+1;
		this.b = numero.nextInt(10)+1;
		this.c = numero.nextDouble((int)10)+1;
		this.d = numero.nextDouble((int)10)+1;
		vida.add("♥");
	
	}

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

	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public int getResposta() {
		return resposta;
	}

	public void setResposta() {
		this.resposta = leia.nextInt();
	}
	
	public double getResp() {
		return resp;
	}

	public void setResp(double resp) {
		this.resp = leia.nextDouble();
	}

	public int getPontucao() {
		return pontucao;
	}

	public void setPontucao(int pontucao) {
		this.pontucao += pontucao;
	}

	public ArrayList<String> getVida() {
		return vida;
	}

	public void setVida(ArrayList<String> vida) {
		this.vida = vida;
	}


		
}
