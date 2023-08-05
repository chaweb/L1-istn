package tp3;

public class Exe3 {

	// Q1 : Écrire une fonction pour afficher la i-ème ligne de la cible

	public static int abs(int n){
		return n > 0 ? n : -n; 
	}

	public static void line(int i, int n){
		int distC = abs(n-i);
		for(int c = 1; c <= 2*n-1 ; c ++){
			int distL =  abs(n-c);
			char chara = (char)('a' + (n - (distL <= distC ? distC : distL)) -1 ); 
			
			System.out.print(chara);
		}
	} 

	// Q2 : Écrire une fonction pour afficher la cible

	public static void square(int n){
		for(int l=1; l<=2*n-1; l++ ){
			line(l,n);
			System.out.println();
		}
	} 

	public static void main(String[] args) {
		// Tester ici la fonction qui affiche la cible
		square(3);
		
	}
}
