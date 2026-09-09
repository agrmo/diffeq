package funktion.eins.eins.ddxyay;

import zahl.eins.Zahlenreihe;
import funktion.eins.eins.Einseinsfunktion;

// java -cp classes funktion.eins.eins.ddxyay.Main;

public class Main {
    static void beispieleins() {

	double[] x = Zahlenreihe.reihe(0, 10, 30);
	Einseinsfunktion f = new Ddxyay();
	double[] y = f.berechne(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println("[" + x[i] + ", " + y[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
