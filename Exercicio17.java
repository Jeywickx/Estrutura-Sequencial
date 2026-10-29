package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		double area, litros;
		int latas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho da área a ser pintadas em metros");
		area = sc.nextDouble();
		litros = (area/6)*1.10;
		latas = (int) Math.ceil(litros/18);
		System.out.println("Quantidade de latas: " + latas);
		System.out.println("Valor total a pagar: " + latas*80 + " $");
		sc.close();

	}

}
