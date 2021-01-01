import java.util.Scanner;

public class QuersummeBerechnenUndAusgeben {

	public static void main(String[] args) {
		
		System.out.print("Gebe eine zahl zwischen 1 und 10000 ein: ");
		Scanner s = new Scanner(System.in);
		String zahl = Integer.toString(s.nextInt());
		System.out.print("Quersumme: ");
		
		for (int i = 0; i < zahl.length(); i++) {
			
			if (i < zahl.length() - 1) {
				System.out.print(zahl.charAt(i) + " + ");
			} else {
				System.out.print(zahl.charAt(i) + " = " + zahl);
			}
		}
		
	}
	
}
