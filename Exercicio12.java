package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		double gigabytes, megabytes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho do arquivo em Gigabytes");
		gigabytes = sc.nextDouble();
		megabytes = (gigabytes * 1024);
		System.out.println("A conversão ficou: " + megabytes + "MB");
		sc.close();

	}

}
