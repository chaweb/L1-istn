package tp5;

public class Exe3 {


	public static void printlog(int[] tab){
		System.out.print("|");
		for(int i=0; i < tab.length; i++){
			System.out.print(tab[i] + "|");
		}
		System.out.println();
	}

	public static int maxValueTab(int[] tab){
		int max = tab[0];
		for(int i=1; i< tab.length; i++ ){
			if(max < tab[i]){
				max = tab[i];
			}
		}
		return max;
	}

	public static void tri(int[] tab){
		for (int i = 0; i < tab.length - 1; i++)  
		{
			 int index = i;  
			 for (int j = i + 1; j < tab.length; j++)
			 {
				  if (tab[j] < tab[index]){ 
					   index = j;
				  }
			 }

			 int min = tab[index];
			 tab[index] = tab[i]; 
			 tab[i] = min;
		}
	}

	public static int[] range(int i){
		int[] tab = new int[i];
		for(int j = 0; j < i; j++){
			tab[j] = j;
		}
		return tab;
	}
	public static boolean estPermutation(int[] tab){
		int[] permute = range(tab.length);
		for(int i=0; i< permute.length; i++){
			for(int j=0; j<tab.length; j++){
				if(permute[i] == tab[j]){
					break;
				}
				if(j == tab.length-1){
					return false;
				}
			}
		}
		return true;
	}

	public static int[] compose(int[] tab1, int[] tab2) {
		int[] tab = new int[tab1.length];

		for(int j = 0; j < tab.length ; j++){
			tab[j] = tab2[tab1[j]];
		}

		return tab;
	}

	public static int itere(int[] tab, int i, int k){
		int[] iterTab = new int[tab.length];
		for(int j = 0; j< k; j++){
			iterTab = compose(iterTab, tab );
		}
		return iterTab[i];
	}

	public static int[] inverse(int[] tab){
		int[] tab2 = new int[tab.length];

		for(int j = 0; j < tab.length ; j++){
			tab2[tab[j]] = j; 
		}

		return tab2;
	}

	public static void main(String[] args) {
		int[] t1 = { 1, 3, 4, 2, 0 }; // t1 est une permutation
		int[] t2 = { 3,3,3 }; // t2 n'est pas une permutation
		int[] t3 = { 1, 0, 2, 4, 3 }; // t3 est une permutation

		
		System.out.println(estPermutation(t1));
		System.out.println(estPermutation(t2));
		System.out.println(estPermutation(t3));
		printlog(compose(t1, t3));
		System.out.println(itere(t1, 0, 3));
		printlog(inverse(t1));


		System.out.println("-------------");

		// bonus 
		printlog(t1);
		printlog(compose(t1, inverse(t1)));

		// La fonction permet de remettre en ordre le tableau

	}
}
