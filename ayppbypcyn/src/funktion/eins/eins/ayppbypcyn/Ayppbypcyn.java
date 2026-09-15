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

	    // [r0, s0]; r1, r2 = r0 +- is0
	    //
	    double[] wurzeln = w.wurzeluntennull();
	    double rnull = wurzeln[0];
	    double snull = wurzeln[1];
	    
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

	    double reins = w.wurzelgleichnull();
	    double ceins = this.ynull;
	    double czwei = this.ypnull - this.ynull * reins;
	    System.out.println("reins " + reins);
	    System.out.println("ceins " + ceins);
	    System.out.println("czwei " + czwei);

	    for (int i = 0; i < x.length; i++) {
		y[i] = ceins * Math.exp(reins * x[i])
		    + czwei * x[i] * Math.exp(reins * x[i]);
	    }
	    
	} else if (w.discriminant() > 0) {

	    double[] wurzeln = w.wurzelobennull();
	    double reins = wurzeln[0];
	    double rzwei = wurzeln[1];
	    double czwei = (this.ypnull - this.ynull * reins) / (rzwei - reins);
	    double ceins = this.ynull - czwei;

	    System.out.println("reins " + reins);
	    System.out.println("rzwei " + rzwei);
	    System.out.println("ceins " + ceins);
	    System.out.println("czwei " + czwei);

	    for (int i = 0; i < x.length; i++) {
		y[i] = ceins * Math.exp(reins * x[i]) + czwei * Math.exp(rzwei * x[i]);
	    }
	}

	return y;	
    }
}
