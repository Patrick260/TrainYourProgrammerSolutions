import java.util.Scanner;

public class FuerEineGanzeZahlAlleTeilerAusgeben {

	public static void main(String[] args) {
		
		System.out.println("Bitte gib eine Zahl ein:");
		Scanner s = new Scanner(System.in);
		Boolean istGanzeZahl = false;
		
		while (!istGanzeZahl) {
			
			String ganzZahl = s.next();
			
			if (ganzZahl.matches("[0-9]+")) {
				
				istGanzeZahl = true;
				int zahl = Integer.parseInt(ganzZahl);
				System.out.println("Die Teiler von " + ganzZahl + " sind:");
				
				for (int i = 1; i < zahl+1; i++) {
					
					if (zahl%i == 0) {
						System.out.println(i);
					}
					
				}
				
			} else {
				System.out.println("Nur ganze Zahlen werden akzeptiert!");
			}
			
		}
		
	}

}
