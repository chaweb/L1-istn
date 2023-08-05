package tp6;

public class Exe2 {

	public static int maxValueTab(int[] tab){
		int max = tab[0];
		for(int i=1; i< tab.length; i++ ){
			if(max < tab[i]){
				max = tab[i];
			}
		}
		return max;
	}


	// Ecrire ici le code calculHistogramme
	public static int[] calculHistogramme(int[] lists){
		int[] value = new int[21];

		int tmp; 
		for(int i = 0; i < 21; i++){
			tmp=0;
			for(int j = 0; j < lists.length; j++){
				tmp += lists[j] == i ? 1 : 0;  
			}
			value[i] = tmp;
		}
		return value;
	}

	// Ecrire ici le code afficheHistoHorizontal
	public static void afficheHistoHorizontal(int[] value){
		int max = maxValueTab(value);
		for(int c = 0; c < 21 ; c++){
				System.out.print("--+");
		}

		System.out.print("\n");
		for(int l = 0; l <= max ; l++){
			for(int c = 0; c < 21 ; c++){
				System.out.print(max - value[c] < l ? "* |" : "  |");
			}
			System.out.print("\n");
		}
		for(int c = 0; c < 21 ; c++){
				System.out.print("--+");
		}
		System.out.print("\n");
		for(int c = 0; c < 21 ; c++){
				System.out.print(c + ((c - c%10) >= 10 ? "" : " ") + "|");
		}
		System.out.print("\n");
		for(int c = 0; c < 21 ; c++){
				System.out.print("--+");
		}

	}
	// Ecrire ici le code afficheHistoVertical
	public static void afficheHistoVertical(int[] value){
		String  séparate = "-";
		for(int i = 0; i < maxValueTab(value) +1 ; i++){
			séparate += "-";
		}
		séparate += "+\n";
		for(int j = 0; j < value.length; j++){
			System.out.print("+--------+" + séparate);
			
			System.out.print("| "+ j + "\t | ");
			for(int i = 0; i <value[j] ; i++){
				System.out.print("*");
			}
			for(int i = 0; i <maxValueTab(value) - value[j] + 1; i++){
				System.out.print(" ");
			}
			System.out.print("|\n");
		}
		System.out.print("+--------+" + séparate);
	}
	
	public static void main(String[] args) {
		int[] notes = {6, 11, 13, 16, 12, 8, 9, 7, 12, 9, 8, 10, 14, 11, 9, 1, 6, 4, 19, 17, 12, 13, 4, 0, 5, 9, 10, 11};

		afficheHistoVertical(calculHistogramme(notes));
		System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		afficheHistoHorizontal(calculHistogramme(notes));
	}
}
