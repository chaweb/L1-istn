package tp6;

public class Exe3 {
	// Ecrire vos fonctions ici :

	public static String affichePolynome(double[] polyA){
		String result = "";
		for(int i = 0; i < polyA.length ; i++ )
		{
			result += polyA[i] + (i > 0 ? "x" + (i > 1 ? "^" + i : "") : "") + (i == polyA.length -1 ? "" : " + ") ;
		}
		return result;
	}

	public static double evalPoly(double[] polyA, double x){
		double result = 0;
		double X = 1;
		for(int i = 0; i < polyA.length ; i++ )
		{
			result += polyA[i] * X;
			X *= x;
		}
		return result;
	}

	public static double[] deriPoly(double[] polyA){
		double[] result = new double[polyA.length - 1];
		for(int i = 1; i < polyA.length; i++ )
		{
			result[i-1] = polyA[i] * i;
		}
		return result;

	}

	public static double[] multiPoly(double[] poly1, double[] poly2){
		double[] result = new double[poly1.length + poly2.length -1 	];
		for(int k = 0 ;  k < result.length ; k++){

			double c = 0;
			for(int m = 0 ; m <= k ; m++){
				try {
					c += poly1[m]*poly2[k-m];
				} catch (Exception e) {}
			}
			result[k] = c;
		}
		return result;
	}
	public static void main(String[] args) {
		double[] polynome = {5.5, 7.7, 3.3, 2.2};

		System.out.println("f(x)= "+affichePolynome(polynome));
		System.out.println("si x=2 => f(x)= "+evalPoly(polynome, 2.0));
		System.out.println("f'(x)="+affichePolynome(deriPoly(polynome)));
		double[] polynome2 = {3.8, 0, 12.84};
		System.out.println("(f*g)(x)= "+affichePolynome(multiPoly(polynome,polynome2)));
	}

}
