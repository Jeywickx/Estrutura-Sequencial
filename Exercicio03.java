package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro");
		n1 = sc.nextInt();
		System.out.println("Informe outro número inteiro");
		n2 = sc.nextInt();
		System.out.println("A soma desses dois número é: " + (n1 + n2));
		sc.close();
	}

}
