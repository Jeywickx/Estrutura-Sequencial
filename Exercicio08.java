package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double valorHora, horasTrabalhadas;
		System.out.println("Informe quanto você ganha por hora");
		valorHora = sc.nextDouble();
		System.out.println("Quantas horas você trabalhou esse mês?");
		horasTrabalhadas = sc.nextDouble();
		
		horasTrabalhadas = (valorHora*horasTrabalhadas);
		System.out.println("Esse mês o seu salario foi: " + horasTrabalhadas);

		sc.close();
	}

}
