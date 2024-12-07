package exerciciosSwitchCase;

import java.util.Scanner;

public class E07CalculadoraDeImpostos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o seu salario e vamos dizer calcular quanto de imposto você deve pagar: ");
		float salarioInteiro = sc.nextFloat();
		int salario = 0;

		if (salarioInteiro <= 1500) {
			salario = 1;
		} else if (salarioInteiro >= 1501 && salarioInteiro <= 3000) {
			salario = 2;
		} else if (salarioInteiro > 3000) {
			salario = 3;
		}

		switch (salario) {
		case 1:
			float imposto = (salarioInteiro / 100) * 5;

			System.out.println("Seu salário de R$" + salarioInteiro + "\nDeve pagar 5% de imposto\n" + "Deve pagar R$"
					+ imposto + " de imposto");
			break;

		case 2:
			imposto = (salarioInteiro / 100) * 10;

			System.out.println("Seu salário de R$" + salarioInteiro + "\nDeve pagar 10% de imposto\n" + "Deve pagar R$"
					+ imposto + " de imposto");
			break;

		case 3:
			imposto = (salarioInteiro / 100) * 15;

			System.out.println("Seu salário de R$" + salarioInteiro + "\nDeve pagar 15% de imposto\n" + "Deve pagar R$"
					+ imposto + " de imposto");
			break;

		default:
			System.out.println("Valor inválido");
			break;
		}

		sc.close();
	}
}
