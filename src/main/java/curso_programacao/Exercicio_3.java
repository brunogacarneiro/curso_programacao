package curso_programacao;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int diferenca = a * b - c * d;

		System.out.println("DIFERENCA = " + diferenca);

		sc.close();
	}

}
