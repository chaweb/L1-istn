package tp4;

import java.util.Arrays;

public class Exe1 {
	public static int[] echange(int[] tab, int i, int j ){
		int temp = tab[i];
		tab[i] = tab[j];
		tab[j] = temp;
		return tab;

	}

	public static void main(String[] args) {
		int[] tab = {1,0,6,8,6,9,2,2,6};
		tab = echange(tab, 3, 6);
		System.out.println(Arrays.toString(tab));

	}
}
