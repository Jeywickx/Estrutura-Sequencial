package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, lado;
		
		System.out.println("Informe o valor do lado do quadrado");
		lado = sc.nextDouble();
		area = (lado*lado);
		area = (area*2);
		System.out.println("O dobro da area do quadro é " + area);
		sc.close();

	}

}
