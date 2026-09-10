package funktion.eins.eins.agdypddxygln;

import funktion.eins.eins.Einseinsfunktion;

public class Agdypddxygln implements Einseinsfunktion {

    //
    // (a/y)+(d/dx)y=0
    // y(0)=y0
    //
    // Nonlinear!
    //

    double bedingungynull;
    double parametera;
    
    public Agdypddxygln(double yn, double pa) {
	this.bedingungynull = yn;
	this.parametera = pa;
    }

    public double[] berechne(double[] x) {

	// c = 1/2 y0^2
	double c = 0.5 * (this.bedingungynull * this.bedingungynull);
	
	double[] y = new double[x.length];

	// y = (2(c-ax))^(1/2)
	for (int i = 0; i < x.length; i++) {
	    y[i] = Math.pow(2.0 * (c - this.parametera * x[i]), 0.5);
	}

	return y;	
    }
}
