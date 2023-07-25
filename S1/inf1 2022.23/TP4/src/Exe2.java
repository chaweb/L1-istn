package tp4;

import java.util.Arrays;

public class Exe2 {
	public static double premiereOccurrence(int[] tab, int a ){
		double find = -1;
		for(int i=0; i <tab.length; i++){
			if(a == tab[i]){
				find = i;
				break;
			}
		}
		return find;
	}
	
	public static double nombreOccurrence(int[] tab, int a ){
		double find = 0;
		for(int i=0; i <tab.length; i++){
			if(a == tab[i]){
				find += 1;
			}
		}
		return find;
	}
	public static int[] replace(int[] tab, int a, int b ){
		for(int i=0; i <tab.length; i++){
			if(a == tab[i]){
				tab[i] = b;
			}
		}
		return tab;
	}
	
	public static void main(String[] args) {
		int[] tab = {1,0,6,8,6,9,2,2,6};
		System.out.println(premiereOccurrence(tab, 6));
		System.out.println(nombreOccurrence(tab, 6));
		System.out.println(Arrays.toString(replace(tab, 6, 7)));
	}
}
