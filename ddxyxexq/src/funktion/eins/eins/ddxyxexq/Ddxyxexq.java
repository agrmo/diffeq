package funktion.eins.eins.ddxyxexq;

import funktion.eins.eins.Einseinsfunktion;

public class Ddxyxexq implements Einseinsfunktion {

    //
    // (d/dx)y = x e^(x^2)
    //

    double bedingungynull;
    
    public Ddxyxexq(double ynull) {
	this.bedingungynull = ynull;
    }

    public double[] berechne(double[] x) {

	double c = this.bedingungynull - 0.5;
	double[] y = new double[x.length];
	
	for (int i = 0; i < x.length; i++) {
	    y[i] = 0.5 * Math.exp(x[i] * x[i]) + c;
	}

	return y;	
    }
}
