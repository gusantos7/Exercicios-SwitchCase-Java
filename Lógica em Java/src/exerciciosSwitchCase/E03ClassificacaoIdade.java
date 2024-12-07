package exerciciosSwitchCase;

import java.util.Scanner;

public class E03ClassificacaoIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();

		if (idade >= 0 && idade <= 12) {
			idade = 1;
		} else if (idade >= 13 && idade <= 17) {
			idade = 2;
		} else if (idade >= 18 && idade <= 59) {
			idade = 3;
		} else if (idade >= 60) {
			idade = 4;
		}

		switch (idade) {

		case 1:
			System.out.println("Criança");
			break;
			
		case 2:
			System.out.println("Adolescente");
			break;
			
		case 3:
			System.out.println("Adulto");
			break;
			
		case 4:
			System.out.println("Idoso");
			break;
		}

		sc.close();
	}
}
