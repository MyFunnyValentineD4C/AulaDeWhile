package aulaDeWhile;

import java.util.Random;
import java.util.Scanner;

public class CavernaDoDragao {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Random dragao = new Random ();
		
		int Lado, Escolha, Tesouros = 0;
		int LadoDoDragao = dragao.nextInt(3) +1;
		
		System.out.println("Você vê uma caverna, você irá explora-la ou não? ");
		System.out.println("1 - Sim, 2 - Não");
		Escolha = ler.nextInt();
		
		if (Escolha == 1) {
			System.out.println("Ótimo! Agora, não há chance de volta. Você como um nobre aventureiro que é, opta por adentrar a caverna e explorar o que a dentro de seus interiores");
			System.out.println("Você se depara com 3 opções, ir para frente, para a esquerda, ou para a direita");
			System.out.println("O que você escolhe?");
			System.out.println("1 - Esquerda, 2 - Direita, 3 - Frente");
			Lado = ler.nextInt();
			
		while (Lado != LadoDoDragao) {
			Tesouros++;
			System.out.println("Você encontrou um tesouro! Parabéns!");
			System.out.println("Selecione um lado para prosseguir");
			System.out.println("1  - Esquerda, 2 - Direita, 3 - Frente");
			Lado = ler.nextInt();
		}
			if (Lado == LadoDoDragao) {
				System.out.println("Em meio a sua jornada, você encontrou um dragão");
				System.out.println("Game Over");
				System.out.println("Número de Tesouros Coletados: " +Tesouros);
				
			}
			
	
		}
		else if (Escolha == 2) {
			System.out.println("Você não teve coragem de adentrar a caverna e fugiu!");
		}
		else {
			System.out.println("Número inválido");
			ler.close();
		}
		
	}

}

