public class Plausability {
	public static void main(String[] args) {
		int ergebnis = berechne(); // Der Rueckgabewert von berechne()
		// soll ueberprueft werden.
		System.out.println("Das Ergebnis muss groesser gleich 0 und " + "kleiner als 24 sein.");
		assert testeErgebnis(ergebnis) : "Ergebnis = " + ergebnis;
		System.out.println("Das Ergebnis lautet: " + ergebnis);
	}

	private static int berechne() {
		// beliebige Berechnung
		return -1;
	}

	private static boolean testeErgebnis(int erg) {
		// Das Ergebnis muss groesser gleich 0
		// und kleiner gleich 23 sein
		if ((erg >= 0) && (erg <= 23))
			return true;
		return false;
	}
}
