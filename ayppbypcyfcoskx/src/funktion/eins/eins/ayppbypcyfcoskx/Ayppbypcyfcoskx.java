package funktion.eins.eins.ayppbypcyfcoskx;

import funktion.eins.eins.Einseinsfunktion;

public class Ayppbypcyfcoskx implements Einseinsfunktion {

    //
    // ay'' + by' + cy = fcos(kx)
    // y(0) = 0
    // y'(0) = 0
    // k = 2pi
    // f0 = 1000
    // a = 1
    // b = pi
    // c = 100pi^2
    //

    public Ayppbypcyfcoskx() {
	
    }

    public double[] berechne(double[] x) {

	double[] y = new double[x.length];
	double amplitude = 1.05;
	double cone = -amplitude;
	double ctwo = -0.05;
	double rzero = -1.5;
	double szero = 31.0;
	double k = 2*Math.PI;
	double a = 1;
	double b = Math.PI;
	double c = 100 * Math.pow(Math.PI,2);
	double fzero = 1000;
	double theta = 0.0208;

	for (int i = 0; i < x.length; i++) {

	    double yparticular = amplitude * Math.cos(k * x[i] - theta);
	    double yhomogenous = Math.exp(rzero * x[i]) * (cone * Math.cos(szero * x[i])
							   + ctwo * Math.sin(szero * x[i]));
	    
	    y[i] = yparticular + yhomogenous;
	}

	return y;	
    }
}
