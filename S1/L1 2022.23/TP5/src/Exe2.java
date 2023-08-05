package tp5;

public class Exe2 {
	public static void printlog(int[] tab){
		System.out.print("|");
		for(int i=0; i < tab.length; i++){
			System.out.print(tab[i] + "|");
		}
		System.out.println();
	}
	public static int[] concatenation(int[] tab1, int[] tab2){
		int[] tmp = new int[tab1.length + tab2.length];
		for(int i=0; i < tab1.length; i++){
			tmp[i] = tab1[i];
		}
		for(int i=0; i < tab2.length; i++){
			tmp[i + tab1.length] = tab2[i];
		}
		return tmp;
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

	public static int[] fusionTri(int[] tab1, int[] tab2){
		
		int[] tmp = concatenation(tab1, tab2);
		tri(tmp);
		return tmp;
	}
	public static void main(String[] args) {
		int[] t1 = { 2, 5, 6, 6 }; // t1 est trié
		int[] t2 = { 1, 2, 3, 4, 5 }; // t2 est trié


		printlog(fusionTri(t1, t2));
		
	}
}
	