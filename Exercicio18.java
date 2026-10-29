package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double arquivo, velocidadeInternet, tempo;
		System.out.println("Informe o tamanho do arquivo para download em MB");
		arquivo = sc.nextDouble();
		System.out.println("Informe a velocidade do link de internet em Mbps");
		velocidadeInternet = sc.nextDouble();
		velocidadeInternet = (velocidadeInternet/8);
		tempo = (arquivo/velocidadeInternet);
		tempo = (tempo/60);
		System.out.println("o tempo aproximado de download desse arquivo em minutos é " + tempo + " minutos");
		
		sc.close();
	}

}
