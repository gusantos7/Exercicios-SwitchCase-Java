package exerciciosSwitchCase;

import java.util.Scanner;

public class E02OperacoesAritmeticas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite abaixo dois números e um operador (+, -, *, /) respectivamente.");

		System.out.println("Digite o primeiro número:");
		float numero1 = sc.nextInt();

		System.out.println("Digite o operador (+, -, *, /):");
		String operador = sc.next();

		System.out.println("Digite o segundo número:");
		float numero2 = sc.nextInt();

		System.out.println("");

		switch (operador) {
		case "+":
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;

		case "-":
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));

			if (numero1 != numero2) {
				System.out.println("OU");
				System.out.println(numero2 + " - " + numero1 + " = " + (numero2 - numero1));
			}

			break;

		case "*":
			System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;

		case "/":
			System.out.println(numero1 + " / " + numero2 + " = " + String.format("%.2f", (numero1 / numero2)));

			if (numero1 != numero2) {
				System.out.println("Ou");
				System.out.println(numero2 + " / " + numero1 + " = " + String.format("%.2f", (numero2 / numero1)));
			}

			break;

		default:
			System.out.println("Houve algum erro de digitação, por favor tente novamente.");
			break;
			
		}
		
		sc.close();
		
	}
}
