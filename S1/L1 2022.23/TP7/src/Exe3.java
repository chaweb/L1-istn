package tp7;

public class Exe3 {
	
	// Écrire une fonction pour vérifier si un tableau est normal
	public static boolean estNormal(int[][] tab){
		int mn = tab.length * tab[0].length;

		cellule: 
		for(int x=1 ; x<=mn ; x++){
			for(int i=0; i<tab.length ; i++){
				for(int y=0 ; y<tab[i].length ; y++){
					if(tab[i][y] == x){
						continue cellule;
					}
				}
			}
			return false;
		}

		return true;
	}
	public static void main(String[] args) {
		int[][] rectangle = {{1, 12, 20, 8, 17, 6, 13}, 
	             			 {14, 2, 10, 21, 9, 16, 5}, 
	             			 {18, 19, 3, 4, 7, 11, 15}};

		System.out.println(estNormal(rectangle));
	}
}
