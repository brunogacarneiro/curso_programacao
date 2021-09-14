package curso_programacao;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double precoTerreno = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", precoTerreno);

		sc.close();
	}
}
