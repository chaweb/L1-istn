package tp3;

public class Exe1 {
	public static void minuscule() {
		char alpha = 'a';
		for (int x=0; x<=25; x++){
			System.out.println((char)(alpha + x));
		}
	}


	public static void majuscule() {
		char alpha = 'Z';
		for (int x=0; x<=25; x++){
			System.out.println((char)(alpha - x));
		}
	}

	public static void main(String[] args) {
		minuscule();
		majuscule();
	}
}
