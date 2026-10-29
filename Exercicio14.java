package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		double pesoPeixe, excesso;
		double multa = 4.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos kg tem o peixe pescado");
		pesoPeixe = sc.nextDouble();
		
		if (pesoPeixe <= 50.0) {
			multa =0.0;
			excesso = 0.0;
			System.out.println("Peso do peixe: " + pesoPeixe);
			System.out.println("multa:" + multa);
			System.out.println("Excesso: " + excesso);
		} else {
			excesso = (pesoPeixe-50.0);
			multa = (excesso*multa);
			System.out.println("Peso do Peixe: " + pesoPeixe + " kg");
			System.out.println("multa: " + multa);
			System.out.println("Excesso: " + excesso + " kg");
			
		}
		
		
		sc.close();
	}

}
