package funktion.eins.eins.ddxyxcosx;

import funktion.eins.eins.Einseinsfunktion;

//
// (d/dx)y=x cos(x)
// y(0)=y0
//
public class Ddxyxcosx implements Einseinsfunktion {

    double bedingungynull;
    
    public Ddxyxcosx(double yn) {
	this.bedingungynull = yn;
    }

    public double[] berechne(double[] x) {

	double c = this.bedingungynull - 1;
	double[] y = new double[x.length];
	
	for (int i = 0; i < x.length; i++) {
	    y[i] = x[i] * Math.sin(x[i]) + Math.cos(x[i]) + c;
	}

	return y;	
    }
}
