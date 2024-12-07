package exerciciosSwitchCase;

import java.util.Scanner;

public class E05NotaDoAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua nota e vou te dizer a sua classificação:");
		System.out.print("Nota: ");
		
		String input = sc.next();
		//verificação para caso digite número real e/ou numero real com virgula.
		input = input.replace(",", ".");
		float nota = Float.parseFloat(input);
		int notaInteira = (int) nota;
		
		System.out.println("");

		switch (notaInteira) {
		case 0:
		case 1:
		case 2:
			System.out.println("Classificação: F");
			break;

		case 3:
		case 4:
			System.out.println("Classificação: D");
			break;

		case 5:
		case 6:
			System.out.println("Classificação: C");
			break;

		case 7:
		case 8:
			System.out.println("Classificação: B");
			break;

		case 9:
		case 10:
			System.out.println("Classificação: A");
			break;

		default:
			System.out.println("Notá inválida, digite um número de 1 à 10.");
			break;
		}

		sc.close();
	}
}
