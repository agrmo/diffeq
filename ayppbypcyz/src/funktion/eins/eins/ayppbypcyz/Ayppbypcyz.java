package funktion.eins.eins.ayppbypcyz;

import funktion.eins.eins.Einseinsfunktion;

public class Ayppbypcyz implements Einseinsfunktion {

    //
    // ay'' + by' + cy = 0
    // y(0) = ynull
    // y'(0) = ypnull
    //

    double a;
    double b;
    double c;
    double ynull;
    double ypnull;

    public Ayppbypcyz(double ea, double eb, double ec,
		      double eynull, double eypnull) {
	this.a = ea;
	this.b = eb;
	this.c = ec;
	this.ynull = eynull;
	this.ypnull = eypnull;
    }

    public double[] berechne(double[] x) {

	double[] y = new double[x.length];

	for (int i = 0; i < x.length; i++) {
	    y[i] = 0;
	}

	return y;	
    }
}
