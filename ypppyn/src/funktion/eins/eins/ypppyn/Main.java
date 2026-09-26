package funktion.eins.eins.ypppyn;

import zahl.eins.Zahlenreihe;
import funktion.eins.eins.Einseinsfunktion;

// funktion.eins.eins.ypppyn.Main

public class Main {
    static void beispieleins() {

	double[] x = Zahlenreihe.reihe(0, 5, 10);
	Einseinsfunktion f = new Ypppyn(100, 100);
	double[] y = f.berechne(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println("[" + x[i] + ", " + y[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
