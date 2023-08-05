package tp1;

import java.util.*;

public class Exe6 {
	//Conversion secondes

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nb de seconde :");
		int SecInput = sc.nextInt();

		int sec = SecInput % 60;

		int min = (SecInput/60) % 60;
		int hour = (SecInput/3600) % 24;
		int day = (SecInput/86400) % 365;
		int year = (SecInput/(86400 * 365));

		System.out.println("année :" + year + " ; jour : " + day + " ; heure :" + hour + " ; Min : " + min + " ; Sec : " + sec);

		sc.close();
	}
}
