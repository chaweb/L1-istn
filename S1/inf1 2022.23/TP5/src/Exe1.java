package tp5;

public class Exe1 {

	public static void printlog(int[] tab){
		System.out.print("|");
		for(int i=0; i < tab.length; i++){
			System.out.print(tab[i] + "|");
		}
		System.out.println();
	}

	public static int[] copieTableau(int[] tab){
		int[] tmp = new int[tab.length];
		for(int i=0; i < tab.length; i++){
			tmp[i] = tab[i];
		}
		return tmp;
	}

	public static int[] sousTableau(int[] tab, int a, int b){
		int[] tmp = new int[b -a +1];
		for(int i=a; i <= b; i++){
			tmp[i-a] = tab[i];
		}
		return tmp;
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

		int[] tab = {1,0,6,8,6,9,2,2,6};

		printlog(tab);

		int[] tab2 = sousTableau(tab, 3,6);

		printlog(tab2);

		int[] tab3 = concatenation(tab, tab2);

		printlog(tab3);


		tri(tab3);

		printlog(tab3);

		

		printlog(fusionTri(tab3, tab2));

	}
}
