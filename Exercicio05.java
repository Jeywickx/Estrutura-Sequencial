package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double metros =0;
		double centimetros;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de metros que deseja converter para centímetros");
		metros = sc.nextDouble();
		centimetros = (metros*100); 
		System.out.println("A conversao ficou:" + centimetros +"cm");
		sc.close();
	}

}
