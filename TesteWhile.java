package aulaDeWhile;

import java.util.Scanner;

public class TesteWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n;
		
		System.out.println("Digite um número");
		n = ler.nextInt();
		
		while (n % 2 != 0) {
			System.out.println("O número digitado não é par, tente novamente");
			n = ler.nextInt();
		}
		System.out.println("O número " +n +" é par!");
		ler.close();
	}

}
