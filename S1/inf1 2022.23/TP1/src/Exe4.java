package tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class Exe4 {
	//Parité d'une somme

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a :");
		int a = sc.nextInt();
		System.out.print("b :");
		int b = sc.nextInt();
		System.out.print("c :");
		int c = sc.nextInt();

		
		System.out.println("la somme est " + ((a + b + c) % 2 == 0 ? "paire" : "impaire"));
	}
}
