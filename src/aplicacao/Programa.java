package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leitura da largura com validacao

		double largura;

		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextDouble();

		while (largura <= 0) {

			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();

		}

		// Leitura da altura com validacao

		double altura;
		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextDouble();

		while (altura <= 0) {

			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}

		// MENU

		int opcaoMenu = 0;

		while (opcaoMenu != 3) {

			System.out.println();
			System.out.println("MENU");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opcao: ");

			opcaoMenu = sc.nextInt();

			if (opcaoMenu == 1) {

				double area = altura * largura;

				System.out.println();
				System.out.printf("AREA = %.1f%n", area);

			}

			else if (opcaoMenu == 2) {

				double perimetro = altura * 2 + largura * 2;

				System.out.println();
				System.out.printf("PERIMETRO = %.1f%n", perimetro);

			}

			else if (opcaoMenu == 3) {

				System.out.println();
				System.out.println("FIM DO PROGRAMA!");

			}

			else {

				System.out.println();
				System.out.println("OPÇÃO INVALIDA");

			}

		}

	}

}

