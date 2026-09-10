package funktion.eins.eins.ddxyxcosx;

import zahl.eins.Zahlenreihe;
import funktion.eins.eins.Einseinsfunktion;

// java -cp classes funktion.eins.eins.ddxyxcosx.Main;

public class Main {
    static void beispieleins() {

	Einseinsfunktion f = new Ddxyxcosx(200);
	double[] x = Zahlenreihe.reihe(0, 30, 10);
	double[] y = f.berechne(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println("[" + x[i] + ", " + y[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
