package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		double litros, area;
		int latas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho em metros quadrados da área que vai ser pintada");
		area = sc.nextDouble();
		litros = (area/3);
		latas = (int) (Math.ceil(litros/18));
		System.out.println("Quantidade de latas: " + latas);
		System.out.println("Valor total a pagar: " + latas*80 + " $");
		
		sc.close();

	}

}
