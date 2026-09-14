package funktion.eins.eins.ayppbypcyn;

import zahl.eins.Zahlenreihe;
import funktion.eins.eins.Einseinsfunktion;

// funktion.eins.eins.ayppbypcyn.Main

public class Main {
    static void beispieleins() {

	double[] x = Zahlenreihe.reihe(0, 10, 10);

	Einseinsfunktion f = new Ayppbypcyn(2, 1, 10,
					    10, 5);
	double[] y = f.berechne(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println("[" + x[i] + ", " + y[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
