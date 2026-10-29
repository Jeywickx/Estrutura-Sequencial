package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		double temperatura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma temperatura em graus Celsius");
		temperatura = sc.nextDouble();
		temperatura = (temperatura * 9/5) + 32;
		System.out.println("A conversão ficou " + temperatura + " Fahrenheit");
		sc.close();

	}

}
