package funktion.eins.eins.ayppbypcyfcoskx;

import zahl.eins.Zahlenreihe;
import funktion.eins.eins.Einseinsfunktion;

// funktion.eins.eins.ayppbypcyfcoskx.Main

public class Main {
    static void beispieleins() {

	double[] x = Zahlenreihe.reihe(0, 10, 10);
	Einseinsfunktion f = new Ayppbypcyfcoskx();
	double[] y = f.berechne(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println("[" + x[i] + ", " + y[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
