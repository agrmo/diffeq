package funktion.eins.eins.agdypddxygln;

import zahl.eins.Zahlenreihe;
import funktion.eins.eins.Einseinsfunktion;

// java -cp classes funktion.eins.eins.agdypddxygln.Main;

public class Main {
    static void beispieleins() {

	double[] x = Zahlenreihe.reihe(0, 80, 5);
	Einseinsfunktion f = new Agdypddxygln(100, 90);
	double[] y = f.berechne(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println("[" + x[i] + ", " + y[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
