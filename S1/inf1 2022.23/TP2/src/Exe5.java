package tp2;
import java.util.Scanner;

public class Exe5 {

	public static void triangle(int h) {
		for (int x=h; x>=1; x--){
			System.out.println("*".repeat(x));
		}
	}

	//------------------------------------------
	public static void carre(int h) {
		System.out.println("*".repeat(h));
		for (int x=2; x<=h-1; x++){
			System.out.println("*" + " ".repeat(h-2) + "*");
		}
		System.out.println("*".repeat(h));
	}

	//------------------------------------------
	public static void grandZ(int h) {
		System.out.println("*".repeat(h));
		for (int x=2; x<=h-1; x++){
			System.out.println(" ".repeat(h-x) + "*" + " ".repeat(h-(h-x)));
		}
		System.out.println("*".repeat(h));
	}

	//------------------------------------------
	public static void pyramide(int h) {
		for (int x=0; x<=h-1; x++){
			System.out.println(" ".repeat(h-x) + "*".repeat(x+1) + "*".repeat(h - (h - x)));
		}
	}

	//------------------------------------------
	public static void grandN(int h) {
		System.out.println("*" + " ".repeat(h-2) + "*");
		for (int x=1; x<=h-2; x++){
			System.out.println("*" + " ".repeat(x -1 ) + "*" + " ".repeat(h - x -2) + "*");
		}
		System.out.println("*" + " ".repeat(h-2) + "*");
	}

	//------------------------------------------

	// Figures d'étoiles 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("hauteur :");
		int hauteur = sc.nextInt();

		System.out.print("type figuer (entre 1 et 5) : "); 
		int type = sc.nextInt();
	
		if(type == 1){
			triangle(hauteur);
		}
		if(type == 2){
			carre(hauteur);
		}
		if(type == 3){
			grandZ(hauteur);
		}
		if(type == 4){
			pyramide(hauteur);
		}
		if(type == 5){
			grandN(hauteur);
		}

	}
}
