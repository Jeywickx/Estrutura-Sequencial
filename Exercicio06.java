package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double area, raio=0;
		double pi = 3.1415;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo");
		raio = sc.nextDouble();
		area = (pi*Math.pow(raio, 2));
		System.out.println("A Área do circulo é: " + area);
		sc.close();
		
		

	}

}
