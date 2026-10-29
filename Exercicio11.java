package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		int n1, n2;
		double n3, r1, r2, r3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro");
		n1 = sc.nextInt();
		System.out.println("Informe outro numero inteiro");
		n2 = sc.nextInt();
		System.out.println("Informe um número real");
		n3 = sc.nextDouble();
		r1 = (n1*2) * (n2/2.0);
		r2 = (n1*3) + n3;
		r3 = Math.pow(n3, 3);
		System.out.println("O produto do dobro do primeiro com a metade do segundo: " + r1 );
		System.out.println("A soma do triplo do primeiro com o terceiro: " + r2);
		System.out.println("O terceiro elevado ao cubo: " + r3);
		sc.close();
	}

}
