public class Konto {

	private int kontonummer;
	private double saldo;

	Konto(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	Konto(int kontonummer, double saldo) throws KontoAusnahme {
		if (saldo < 0)
			throw new KontoAusnahme("Negativer Saldo: " + saldo);
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}

	public void zahleAus(double betrag) throws KontoAusnahme {
		if (betrag < 0)
			throw new KontoAusnahme("Negativer Betrag: " + betrag);
		if (saldo < betrag)
			throw new KontoAusnahme("Betrag > Saldo");
		saldo -= betrag;
	}

	public double getSaldo() {
		return saldo;
	}
}
