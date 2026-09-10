package funktion.eins.eins.ddxyxexq;

import zahl.eins.Zahlenreihe;
import funktion.eins.eins.Einseinsfunktion;

// java -cp classes funktion.eins.eins.ddxyxexq.Main;

public class Main {
    static void beispieleins() {

	// (d/dx)y = x e^(x^2)
	// y(0) = 5
	// x = [0,3]
	// y = [...]
	
	double[] x = Zahlenreihe.reihe(0, 3, 30);
	Einseinsfunktion f = new Ddxyxexq(5);
	double[] y = f.berechne(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println("[" + x[i] + ", " + y[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
