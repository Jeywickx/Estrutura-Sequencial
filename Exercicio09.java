package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		double temperatura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma temperatura em Fahrenheit");
		temperatura = sc.nextDouble();
		temperatura = 5*((temperatura-32) / 9);
		System.out.println("A conversao ficou " + temperatura + " Celsius");
		sc.close();

	}

}
