package tp4;

import java.util.ArrayList;
import java.util.Arrays;

public class Exe3 {

	public static int[] echange(int[] tab, int i, int j ){
		int temp = tab[i];
		tab[i] = tab[j];
		tab[j] = temp;
		return tab;

	}

	public static int[] miroirCopie(int[] tab){
		int[] tabCopie = tab;
		for(int i=tab.length-1; i > 0; i--){
			tabCopie[tabCopie.length - i -1] = tab[i];
		}
		return tabCopie;
	} 

	public static int[] miroirEnPlace(int[] tab){
		
		for(int i=0; i < (tab.length-1)/2; i++){
			tab = echange(tab, i, tab.length-i-1);
		}
		return tab;
	} 

	public static void main(String[] args) {
		int[] tab = {1,0,6,8,6,9,2,2,6};
		System.out.println(Arrays.toString(miroirCopie(tab)));
	}
}
