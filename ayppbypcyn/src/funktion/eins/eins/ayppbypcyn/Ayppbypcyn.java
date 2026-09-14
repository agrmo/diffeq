package funktion.eins.eins.ayppbypcyn;

import funktion.eins.eins.Einseinsfunktion;
import wurzel.Wurzel;

public class Ayppbypcyn implements Einseinsfunktion {

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

    public Ayppbypcyn(double ea, double eb, double ec,
		      double eynull, double eypnull) {
	this.a = ea;
	this.b = eb;
	this.c = ec;
	this.ynull = eynull;
	this.ypnull = eypnull;
    }

    public double[] berechne(double[] x) {

	Wurzel w = new Wurzel(this.a, this.b, this.c);
	double[] y = new double[x.length];

	if (w.discriminant() < 0.0) {
	    
	    double rnull = -this.b / (2.0 * this.a);
	    double snull = (1.0/(2.0*this.a)) * Math.sqrt(-(this.b*this.b - 4.0 * this.a * this.c));
	    double ceins = this.ynull;
	    double czwei = (this.ypnull - this.a * rnull)/(snull);

	    System.out.println("rnull " + rnull);
	    System.out.println("snull " + snull);
	    System.out.println("ceins " + ceins);
	    System.out.println("czwei " + czwei);
	
	    for (int i = 0; i < x.length; i++) {
		y[i] = Math.exp(rnull * x[i]) * (ceins * Math.cos(snull * x[i])
						 + czwei * Math.sin(snull * x[i]));
	    }
	    
	} else if (w.discriminant() == 0.0) {
	    
	} else if (w.discriminant() > 0) {
	    
	}

	return y;	
    }
}
