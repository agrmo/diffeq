package funktion.eins.eins.egyddxyxa;

import funktion.eins.eins.Einseinsfunktion;

//
// (1/y) (d/dx)y = x^a
// y(0) = y0
//
public class Egyddxyxa implements Einseinsfunktion {

    double a;
    double ynull;
    
    public Egyddxyxa(double ea, double ey) {
	this.a = ea;
	this.ynull = ey;
    }

    public double[] berechne(double[] x) {
	double[] y = new double[x.length];

	for (int i = 0; i < x.length; i++) {
	    y[i] = this.ynull * Math.exp((1.0 / this.a) * Math.pow(x[i], this.a + 1.0));
	}

	return y;
    }
}
