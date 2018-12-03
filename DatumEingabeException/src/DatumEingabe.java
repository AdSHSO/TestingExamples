import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DatumEingabe {
	public Date pruefeDatum(String datum) throws ParseException {
		// Eine auf die Rechnerlokation abgestimmte Instanz der Klasse
		// DateFormat wird erzeugt.
		DateFormat df = DateFormat.getDateInstance();
		// strenge Datumspr�fung einschalten
		df.setLenient(false);
		// Datum �berpr�fen und in ein Date-Objekt wandeln.
		// Die Methode parse() wirft eine ParseException, wenn in
		// datum kein g�ltiges Datum steht.
		Date d = df.parse(datum);
		return d;
	}

	public static void main(String[] args) {
		DatumEingabe v = new DatumEingabe();
		String[] testdaten = { "13.06.2013", "13.13.2013" };
		Date datum = null;
		for (int i = 0; i < testdaten.length; i++) {
			//try {
				datum = v.pruefeDatum(testdaten[i]);
				System.out.println("Eingegebenes Datum ist ok:\n" + datum);
			//} catch (ParseException e) {
				System.out.println("Eingegebenes Datum ist nicht ok:\n" + testdaten[i]);
			//}
		}
	}
}
