package tp3;

import java.util.Scanner;

public class Exe2 {

	// Q1 : Écrire une fonction impotMontant qui prend en entrée le salaire d'une
	// personne et qui retourne le montant de son impôt.

	public static double impotMontant(double salaire) {
		double impot = 0;
		// à compléter
		
		if(10064 < salaire){
			//first frac
			impot += ((salaire < 25659? salaire : 25659 ) - 10064)*0.11 ;
			// System.out.println(impot);

			if(25659 < salaire){
				//seconde frac
				impot += ((salaire < 73369? salaire : 73369 ) - 25659)*0.3;
				// System.out.println(impot);

				if(73369 < salaire){
					//third  frac
					impot += ((salaire < 157805? salaire : 157805 ) - 73369)*0.41;
					// System.out.println(impot);

					if(157805 < salaire){
						//fourth frac
						impot += (salaire - 157805)*0.45;
						// System.out.println(impot);
					}
				}
			}
		}
	
		return impot;
	}

	// Q2: Écrire une fonction pourcentageImposition, qui prend en entrée le salaire
	// d'une personne et qui retourne son pourcentage d'imposition.

	public static double pourcentageImposition(double salaire, double impot) {
		double pourcentage = 0;
		// à compléter
		pourcentage = impot/salaire*100;

		return pourcentage;
	}

	// Q3 : Écrire la fonction gainMariage pour calculer le gain d'impot des couples
	public static double gainMariage(double impot1, double impot2) {
		double gain = 0;
		// à compléter
		gain = impot2 - impot1;

		return gain;
	}

	public static void main(String[] args) {
		// Tester les fonctions sur des exemples
		Scanner sc = new Scanner(System.in);
		System.out.print("salaire1 :");
		double salaire1 = sc.nextInt();
		double impot1 = impotMontant(salaire1);
		double pourcentage1 = pourcentageImposition(salaire1, impot1);
		

		System.out.println("salaire : "+salaire1+"e ; impot: " + impot1+ "e; pourcentage d'imposition : " + pourcentage1+ "%");

		System.out.print("salaire2 :");
		double salaire2 = sc.nextInt();
		double impot2 = impotMontant(salaire2);
		double pourcentage2 = pourcentageImposition(salaire2, impot2);
		

		System.out.println("salaire : "+salaire2+"e ; impot: " + impot2+ "e; pourcentage d'imposition : " + pourcentage2+ "%");

		System.out.println("gain mariage");
		double salaire1et2 = salaire1 + salaire2;
		double impot1et2 = impotMontant(salaire1et2/2);
		double pourcentage1et2 = pourcentageImposition(salaire1et2, impot1et2);


		System.out.println("salaire : "+salaire1et2+"e ; impot: " + impot1et2+ "e; pourcentage d'imposition : " + pourcentage1et2+ "%");
		System.out.println("gain impot personne 1 :" +  gainMariage(impot1et2, impot1) + "e");
		System.out.println("gain impot personne 2 :" +  gainMariage(impot1et2, impot2) + "e");


		sc.close();
	}
}
