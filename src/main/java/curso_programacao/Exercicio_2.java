package curso_programacao;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();

	}

}
