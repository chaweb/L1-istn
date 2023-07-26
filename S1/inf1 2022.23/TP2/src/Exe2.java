package tp2;

public class Exe2 {
	//Conversion degrés Fahrenheit vers Celsius
	
	public static void main(String[] args) {
		for (double x=250; x>=-20; x -= 10){
			System.out.print(x + "°F ---> " );
			System.out.println((5*x/9 - 160/9) + "°C");
		}
	}

}
