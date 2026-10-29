package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a sua primeira nota");
		nota1 = sc.nextDouble();
		System.out.println("Informe sua segunda nota");
		nota2 = sc.nextDouble();
		System.out.println("Informe sua terceira nota");
		nota3 = sc.nextDouble();
		System.out.println("Informe sua quarta nota");
		nota4 = sc.nextDouble();
		System.out.println("A média dessas notas é: " + ((nota1+nota2+nota3+nota4)/4));
		
		sc.close();
	}

}
