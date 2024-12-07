package exerciciosSwitchCase;

import java.util.Scanner;

public class E10CalculadoraFatorial {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro e vou calcular o seu fatorial: ");
		int numero = sc.nextInt();
		
		//Verificação de número positivo ou negativo
		switch(numero < 0 ? 1:0) {
		
		//negativo
		case 1:
			System.out.println("Não é possivel fatoriar um número negativo");
			break;

		//positivo
		case 0:
			
			int resultado = 1;
			
			switch(numero) {
			case 0:
				//número igual a zero, fatorial é 1
				resultado = 1;
				break;
				
			default:
				//fatorial
				for(int i = 1; i <= numero; i++) {
					resultado *= i;
				}
				break;
				
			}	
			
			System.out.println("O fatorial de " + numero + " é: " + resultado);
		}
		
		sc.close();
	}
	
}
