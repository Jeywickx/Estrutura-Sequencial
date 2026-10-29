package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double valorHora, horasTrabalhadas, salario, IR, INSS, sindicato;
		System.out.println("Infome quanto você recebe por hora");
		valorHora = sc.nextDouble();
		System.out.println("Informe quantas horas você trabalhou este mês");
		horasTrabalhadas = sc.nextDouble();
		salario = (valorHora*horasTrabalhadas);
		System.out.println("Salario bruto: " + salario + " $");
		IR = (salario*0.11);
		INSS = (salario*0.08);
		sindicato = (salario*0.05);
		salario = (salario-(IR+INSS+sindicato));
		System.out.println("Importo de renda: " + IR + "$");
		System.out.println("INSS: " + INSS + " $");
		System.out.println("Sindicato " + sindicato + " $ ");
		System.out.println("Salário liquido: " + salario + " $");
		
		sc.close();
	}

}
