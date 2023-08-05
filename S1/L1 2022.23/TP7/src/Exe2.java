package tp7;

public class Exe2 {
	
	// Écrire une fonction pour vérifier si un tableau est rectangle. 
	
	public static boolean estRectangle(int[][] r2){
		for(int i=1; i < r2.length ; i++){
			if(r2[0].length != r2[i].length){
				return false;
			}
		}
		return true;
	}


	// Écrire une fonction pour vérifier si les sommes des éléments de chaque ligne sont égales

	public static boolean verifierLignes(int[][] r2){
		int sum = 0;
		for(int j=0; j < r2[0].length ; j++){
			sum += r2[0][j];
		}

		int sumvalid;
		for(int i=1; i < r2.length ; i++){
			sumvalid = 0;
			for(int j=0; j < r2[i].length ; j++){
				sumvalid += r2[i][j];
			}
			if(sumvalid != sum){
				return false
			;}
		}
		return true;
	}
	// Écrire une fonction pour vérifier si les sommes des éléments de chaque colonne sont égales
	public static boolean verifierColonnes(int[][] r2){
		int sum = 0;
		for(int j=0; j < r2.length ; j++){
			sum += r2[j][0];
		}

		int sumvalid;
		for(int i=1; i < r2[0].length ; i++){
			sumvalid = 0;
			for(int j=0; j < r2.length ; j++){
				sumvalid += r2[j][i];
			}
			if(sumvalid != sum){
				return false
			;}
		}
		return true;
	}
	// Écrire une fonction pour vérifier si un tableau d'entiers est magique
	public static boolean estMagique(int[][] r2){
		int sum = 0;
		for(int j=0; j < r2.length ; j++){
			sum += r2[j][0];
		}

		if(!verifierLignes(r2)){return false;};
		int sumvalid=-1;
		for(int i=0; sumvalid!=0 ; i++ ){
			sumvalid = 0;

			for(int j=0; j<r2.length ; j++){
				try{
					sumvalid += r2[j][i];
				}catch(Exception  e){}
			}
			if(sumvalid != sum && sumvalid != 0){return false;}

		}




		return true;
	}


	public static void main(String[] args) {
		int[][] rectangle = {{1, 12, 20, 8, 17, 6, 13}, 
	             			 {14, 2, 10, 21, 9, 16, 5}, 
	             			 {18, 19, 3, 4, 7, 11, 15}};

		System.out.println(estRectangle(rectangle));

		System.out.println(verifierLignes(rectangle));

		System.out.println(verifierColonnes(rectangle));

		System.out.println(estMagique(rectangle)? "its magic Bibbidi-Bobbidi-Boo https://www.youtube.com/watch?v=VNKuARjkWEg" : "it's not magic..." );
	}
}
