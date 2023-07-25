package tp2;

public class Exe1 {
	//Précision et variables de type double

	public static void main(String[] args) {
		double x = 0;
		for (int i=1; i<=10; ++i){
			x += 0.1;
			System.out.println(x);
		}
		//je constate que la variable ne fait pas exactement une itération de 0.1 mais d'une valeur proche
	}

}
