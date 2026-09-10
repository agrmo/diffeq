package rechner.zwei.eins;

import funktion.zwei.eins.xminusy.Xminusy;
import funktion.zwei.eins.Zweieinsfunktion;
import feld.zweieins.Zweieinsfeld;

// java -cp classes rechner.zwei.eins.Main;

public class Main {
    static void beispieleins() {

	Zweieinsfunktion funktion = new Xminusy();

	// Berechne f(x)=x-y
	// x = [0, 10] Anzahl 5
	// y = [20, 30] Anzahl 5
 	// Punkte: 5 * 5 = 25
	Zweieinsfeld feld = Zweieinsrechner.berechne(funktion,
						     0, 10, 5,
						     20, 30, 5);

	for (int i = 0; i < feld.ortx.length; i++) {
	    System.out.println("[" + feld.ortx[i] + ", "
			       + feld.orty[i] + ", "
			       + feld.wert[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
