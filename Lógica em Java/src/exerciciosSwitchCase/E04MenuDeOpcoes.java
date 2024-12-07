package exerciciosSwitchCase;

import java.util.Scanner;

public class E04MenuDeOpcoes {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = sc.next();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Pausa interrompida!!");
		}

		System.out.println("");
		System.out.println("Olá " + nome + "!");
		
		boolean continuar = true;
		while (continuar == true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Programa interrompido");
			}
			
			System.out.println("");
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("");
			System.out.println("1 - Exibir \"Olá, Mundo!\"");
			System.out.println("2 - Exibir \"Bem-vindo ao Java\"");
			System.out.println("3 - Sair do programa!");
			System.out.println("");

			System.out.print("Opção: ");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Olá Mundo!");
				break;

			case 2:
				System.out.println("Bem-vindo ao Java");
				break;

			case 3:
				System.out.println("Programa encerrado!");
				continuar = false;
//				System.exit(0);
				break;

			default:
				System.out.println("Opção Inválida, escolha entre 1, 2 ou 3.");
			}
		}
		sc.close();
	}
}
