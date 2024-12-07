package exerciciosSwitchCase;

import java.util.Scanner;

public class E01DiaDaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um dos números abaixo, e direi qual o dia da semana correspondente a ele.");
		for (int i = 1; i < 8; i++) {
			
			if (i == 7) {
				System.out.println(i + ".");
			} else {
				System.out.print(i + ", ");
			}
			
		}
		System.out.println("");
		
		int day = sc.nextInt();

		System.out.println("");

		switch (day) {

		case 1:
			System.out.println("O dia da semana corespondente a esse número é:");
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("O dia da semana corespondente a esse número é:");
			System.out.println("Segunda-feira");
			break;

		case 3:
			System.out.println("O dia da semana corespondente a esse número é:");
			System.out.println("Terça-feira");
			break;

		case 4:
			System.out.println("O dia da semana corespondente a esse número é:");
			System.out.println("Quarta-feira");
			break;

		case 5:
			System.out.println("O dia da semana corespondente a esse número é:");
			System.out.println("Quinta-feira");
			break;

		case 6:
			System.out.println("O dia da semana corespondente a esse número é:");
			System.out.println("Sexta-feira");
			break;

		case 7:
			System.out.println("O dia da semana corespondente a esse número é:");
			System.out.println("Sábado");
			break;

		default:
			System.out.println("Digite apenas um dos números que demos como opção");
			break;
		}
		
		sc.close();
		
	}
}
