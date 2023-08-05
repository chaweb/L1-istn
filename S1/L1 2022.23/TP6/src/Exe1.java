package tp6;

public class Exe1 {

//	public static void printlog(int[] tab){
//		System.out.print("|");
//		for(int i=0; i < tab.length; i++){
//			System.out.print(tab[i] + "|");
//		}
//		System.out.println();
//	}

	// Ecrire ici le code pour la fonction moyenne

	public static double moyenne(int[] n){
		double m = 0; 
		for(int i =0; i< n.length; i++){
			m += n[i];
		}
		return m/n.length;
	} 


	// Ecrire ici le code pour la fonction variance

	public static double variance(int[] n){
		double v = 0; 
		double m = moyenne(n);
		for(int i =0; i< n.length; i++){
			v += Math.pow((n[i] - m), 2);
		}
		return v/n.length;
	} 
	public static void main(String[] args) {
		int[] notes = {3,7,6,18};
		System.out.println(moyenne(notes));
		System.out.println(variance(notes));
	}
}
