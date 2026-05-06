package aulaDeWhile;

import java.util.Scanner;

public class GabaritoProva {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int NAlunos = 0;
		int ProxAluno = 1;
		int P1  = 1, P2 = 2, P3 = 3, P4 = 4, P5 = 5, P6 = 5, P7 = 4, P8 = 3, P9 = 2, P10 = 1;
		int R1, R2, R3, R4, R5, R6, R7, R8, R9, R10;
		int PontuacaoDoAluno = 0;
		int Resposta;
	
		while (ProxAluno == 1) {
			System.out.println("A - 1, B - 2, C - 3, D - 4, E - 5");
			System.out.println("Digite a resposta da 1");
			R1 = ler.nextInt();
			
			System.out.println("Digite a resposta da 2");
			R2 = ler.nextInt();
			
			System.out.println("Digite a resposta da 3");
			R3 = ler.nextInt();
			
			System.out.println("Digite a resposta da 4");
			R4 = ler.nextInt();
			
			System.out.println("Digite a resposta da 5");
			R5 = ler.nextInt();
			
			System.out.println("Digite a resposta da 6");
			R6 = ler.nextInt();
			
			System.out.println("Digite a resposta da 7");
			R7 = ler.nextInt();
			
			System.out.println("Digite a resposta da 8");
			R8 = ler.nextInt();
			
			System.out.println("Digite a resposta da 9");
			R9 = ler.nextInt();
			
			System.out.println("Digite a resposta da 10");
			R10 = ler.nextInt();
			
			if (R1 == P1) {
				PontuacaoDoAluno++;
			}
			if (R2 == P2) {
				PontuacaoDoAluno++;
			}
			if (R3 == P3) {
				PontuacaoDoAluno++;
			}
			if (R4 == P4) {
				PontuacaoDoAluno++;
			}
			if (R5 == P5) {
				PontuacaoDoAluno++;
			}
			if (R6 == P6) {
				PontuacaoDoAluno++;
			}
			if (R7 == P7) {
				PontuacaoDoAluno++;
			}
			if (R8 == P8) {
				PontuacaoDoAluno++;
			}
			if (R9 == P9) {
				PontuacaoDoAluno++;
			}
			if (R10 == P10) {
				PontuacaoDoAluno++;
			}
			System.out.println("Sua pontuação foi de " +PontuacaoDoAluno);
			NAlunos++;
			System.out.println("Algum aluno irá utilizar o sistema?");
			System.out.println("1 - Sim, 2 - Não");
			Resposta = ler.nextInt();
			
			if (Resposta == 0); {
			ProxAluno--;
			
			}
			
			}
			
			
			}

			
		}
		
	

