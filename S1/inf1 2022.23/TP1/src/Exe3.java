package tp1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class Exe3 {
	//Année bissextile

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une année :");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("l'année est bissextile");
		}else { System.out.println("l'année n'est pas bissextile");}

		sc.close();
	}
}
