package funktion.eins.eins.ddxyay;

import funktion.eins.eins.Einseinsfunktion;

public class Ddxyay implements Einseinsfunktion {

    double parametera;
    double bedingungynull;
    
    public Ddxyay(double a, double ynull) {
	this.parametera = a;
	this.bedingungynull = ynull;
    }

    public double[] berechne(double[] x) {

	double c = Math.log(this.bedingungynull);
	double[] y = new double[x.length];
	
	for (int i = 0; i < x.length; i++) {
	    y[i] = c * Math.exp(this.parametera * x[i]);
	}

	return y;	
    }
}
