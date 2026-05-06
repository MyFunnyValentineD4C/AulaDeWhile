package aulaDeWhile;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Random ale = new Random ();
		int NSecreto = ale.nextInt (100) +1;
		int EscolhaDoUsuario;
		int Tentativas = 0;
		
		System.out.println("Tente adivinhar o número (1 - 100)" +NSecreto);
		EscolhaDoUsuario = ler.nextInt();
		
		while (EscolhaDoUsuario != NSecreto) {
			if (EscolhaDoUsuario > NSecreto) {
				System.out.println("O seu número adivinhado é maior que o número secreto");
				Tentativas++;
			EscolhaDoUsuario = ler.nextInt();
			}
	
		else if (EscolhaDoUsuario < NSecreto) {
			System.out.println("O seu número adivinhado é menor que o número secreto");
			Tentativas++;
			EscolhaDoUsuario = ler.nextInt();
			
		}
		}
		if (EscolhaDoUsuario == NSecreto){
			System.out.println("Parabéns, você acertou, o número era " +NSecreto);
			System.out.println("Tentativas " +Tentativas) ;
		}
		
		ler.close();
		
	}}
		
		
	


