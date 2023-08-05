package tp2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Exe4 {

	// Deviner le nombre

	public static int entierAleatoire(int a, int b) {
		// Retourne un entier aléatoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);
	}

	public static void main(String[] args) {
		int player;
		Scanner sc = new Scanner(System.in);

		int r = entierAleatoire(1, 100); 

		do {
			System.out.print("nb :");
			player = sc.nextInt();
			
			if (player > r) {
				System.out.println("plus petit") ; 
			}
			if (player < r) {
				System.out.println("plus grand");
			}
			
		}while (r != player);
		System.out.println("GAGNNNNNER !!!!!");

		sc.close();
	}
}
