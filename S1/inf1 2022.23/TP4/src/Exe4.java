package tp4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		int[] tabVals = {2,5,6,1,9,8,3,4,5,7};
		int[] tabDapls = {-2,3,-1,4};
		int posInit=4;

		ArrayList<Integer> tabCopie = new ArrayList<>();

		for(int i=0; i < tabDapls.length; i++){
			posInit+=tabDapls[i];
			tabCopie.add(tabVals[posInit]);
		}

		System.out.println(tabCopie);
	}

}
