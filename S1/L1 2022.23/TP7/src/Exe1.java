package tp7;

public class Exe1 {
	
	// Écrire une fonction qui affiche le tableau d'entrée
	public static void afficheTab2D(int[][] r2){
		
		System.out.print("+");
		for(int i = 0 ; i < r2[0].length; i++){
			System.out.print("--+");
		}

		for(int i = 0 ; i < r2.length ; i++){
			System.out.print("\n");
			for(int j = 0 ; j < r2[i].length ; j++){
				System.out.print("|" + r2[i][j] + ((r2[i][j] - r2[i][j]%10) >= 10 ? "" : " "));
			}	

			System.out.print("|");
			
			System.out.print("\n");

			System.out.print("+");
			for(int j = 0 ; j < r2[0].length; j++){
				System.out.print("--+");
			}
		}
	}
	public static void main(String[] args) {
		int[][] rectangle = {{1, 12, 20, 8, 17, 6, 13}, 
    			 			 {14, 2, 10, 21, 9, 16, 5}, 
    			 			 {18, 19, 3, 4, 7, 11, 15}};

		afficheTab2D(rectangle);
	}
}
