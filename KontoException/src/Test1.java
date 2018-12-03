public class Test1 {
public static void main(String[] args) throws KontoAusnahme {
// Ausnahmen vom Typ KontoAusnahme werden weitergereicht
// und führen zum Abbruch des Programms.

	Konto kto = new Konto(4711, 500);
    kto.zahleAus(1000);

}
}