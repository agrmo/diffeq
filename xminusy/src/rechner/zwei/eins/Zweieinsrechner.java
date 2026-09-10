package rechner.zwei.eins;

import feld.zweieins.Zweieinsfeld;
import funktion.zwei.eins.Zweieinsfunktion;
import zahl.eins.Zahlenreihe;

public class Zweieinsrechner {

    public static Zweieinsfeld berechne(Zweieinsfunktion f,
					double vonx, double bisx, int anzahlx,
					double vony, double bisy, int anzahly) {

	// Nur in einer Dimension
	double[] xreihe = Zahlenreihe.reihe(vonx, bisx, anzahlx);

	// Nur in einer Dimension
	double[] yreihe = Zahlenreihe.reihe(vony, bisy, anzahly);

	// In zwei Dimensionen
	double[] xliste = new double[anzahlx * anzahly];
	double[] yliste = new double[anzahlx * anzahly];
	double[] zliste = new double[anzahlx * anzahly];

	for (int i = 0; i < anzahlx; i++) {
	    for (int j = 0; j < anzahly; j++) {
		xliste[i * anzahlx + j] = xreihe[i];
		yliste[i * anzahlx + j] = yreihe[j];
	    }
	}

	for (int i = 0; i < anzahlx * anzahly; i++) {
	    zliste[i] = f.berechne(xliste[i], yliste[i]);
	}
	
	Zweieinsfeld feld = new Zweieinsfeld(xliste, yliste, zliste);

	return feld;
    }
}
