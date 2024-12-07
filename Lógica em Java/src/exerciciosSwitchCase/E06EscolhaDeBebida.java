package exerciciosSwitchCase;

import java.util.Scanner;

public class E06EscolhaDeBebida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um dos números abaixo e irei te dizer uma bebida aleatória: ");
		System.out.println("1 - 2 - 3 - 4");
		System.out.println("");
		int numero = sc.nextInt();
		
		switch(numero) {
		
		case 1:
			System.out.println("Sua bebida é: Café");
			break;
		case 2:
			System.out.println("Sua bebida é: Chá");
			break;
		case 3:
			System.out.println("Sua bebida é: Suco");
			break;
		case 4:
			System.out.println("Sua bebida é: Refrigerante");
			break;
		default:
			System.out.println("Número inválido");
			break;
		}
		
		sc.close();
	}
	
}
