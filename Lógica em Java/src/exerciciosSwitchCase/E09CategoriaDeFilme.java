package exerciciosSwitchCase;

import java.util.Scanner;

public class E09CategoriaDeFilme {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a classificação etária do Filme");
		System.out.println("Entre as opções:");
		System.out.println("G - PG - PG-13 - R");
		System.out.println("");
		System.out.print("Classificação: ");
		String classificacao = sc.next();

		classificacao = classificacao.toUpperCase();

		switch (classificacao) {
		case "G":
			System.out.println("Classificação Livre");
			System.out.println("Todos de qualquer idade podem assistir esse filme");
			break;
		case "PG":
			System.out.println("Classificação Parental Guidance (\"Orientação dos Pais\")");
			System.out.println("Recomendado apenas para maiores de 10 anos");
			break;
		case "PG-13":
			System.out
					.println("Classificação Parental Strongly Cautioned (\"Aviso aos Pais - Fortemente Cautelososo\")");
			System.out.println("Recomendado apenas para maiores de 13 anos");
			break;
		case "R":
			System.out.println("Classificação Restricted (\"Restrito\")");
			System.out.println("Apenas para maiores de 18 anos");
			break;
		default:
			System.out.println("Opção invalida, digite apenas as siglas.");
		}

		sc.close();
	}
}
