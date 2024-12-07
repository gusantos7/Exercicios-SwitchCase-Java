package exerciciosSwitchCase;

import java.util.Scanner;

public class E08ConversorParaFahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha qual conversão deseja fazer: ");
		System.out.println("");
		System.out.println("Digite 1 para fazer Fahrenheit para Celsius");
		System.out.println("OU");
		System.out.println("Digite 2 para fazer Celsius para Fahrenheit");
		int conversao = sc.nextInt();

		switch (conversao) {
		case 1:
			System.out.print("Digite a temperatura em Fahrenheit: ");
			float fahrenheit = sc.nextFloat();

			float celsius = (5f / 9f) * (fahrenheit-32);
			System.out.printf(String.format("%.2f", fahrenheit) + "ºF é igual a " + String.format("%.2f", celsius) + "ºC");
			break;

		case 2:
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextFloat();

			fahrenheit = 1.8f * celsius + 32;
			System.out.println(String.format("%.2f", celsius) + "ºC é igual a " + String.format("%.2f", fahrenheit) + "ºF");
			break;
		default:
			System.out.println("Opção inválida, digite apenas 1 ou 2.");
		}

		sc.close();
	}
}
