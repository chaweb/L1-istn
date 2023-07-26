package tp2;

import java.util.Scanner;

public class Exe3 {
	// Somme de 1 à n
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nb n :");
		int n = sc.nextInt();

		//version facile parce que les Maths, c'est 🆒
		System.out.println(n*(n+1)/2);

		//version exercice parce que sinon... pas bien 
		int tmp = 0;
		for (double x=n; x>=0; --x){
			tmp += x;
		}
		System.out.println(tmp);
	}

}
