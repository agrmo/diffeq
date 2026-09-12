package funktion.eins.eins.yppmyn;

import funktion.eins.eins.Einseinsfunktion;

public class Yppmyn implements Einseinsfunktion {

    //
    // (d/dx)^2 y(x) + y(x) = 0
    //
    // y(0) = a
    // y'(0) = b
    //
    // Second order ODE, vanishing Dirichlet

    double a;
    double b;

    public Yppmyn(double ea, double eb) {
	this.a = ea;
	this.b = eb;
    }

    public double[] berechne(double[] x) {
	
	double[] y = new double[x.length];

	for (int i = 0; i < x.length; i++) {
	    y[i] = a * Math.cos(x[i]) + b * Math.sin(x[i]);
	}

	return y;	
    }
}
