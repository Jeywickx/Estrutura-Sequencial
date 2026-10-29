package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		double gigabytes, megabytes, Kilobytes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho do arquivo em Gigabytes");
		gigabytes = sc.nextDouble();
		megabytes = (gigabytes * 1024);
		Kilobytes = (gigabytes * 1024 * 1024);
		System.out.println("A conversão ficou: " + megabytes + "MB");
		System.out.println("A conversão ficou: " + Kilobytes + "KB");
		sc.close();

	}

}
