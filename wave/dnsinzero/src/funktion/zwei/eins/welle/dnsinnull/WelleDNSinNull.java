package funktion.zwei.eins.welle.dnsinnull;

import funktion.zwei.eins.Zweieinsfunktion;

//
// (p/px)^2 u = (p/py)^2 u
// Dirichlet u(x,0)=sin(pi/l x)
// Neumann (p/py) u(x,0)=0
//
// i.e. dnsinnull
//
// Eine Wellen-Gleichung mit Dirichlet-Neumann-Randbedingungen.
//
public class WelleDNSinNull implements Zweieinsfunktion {

    double l;

    public WelleDNSinNull(double l) {
	this.l = l;
    }

    public double[] berechne(double[] x, double[] y) {

	// i.e.
	// u(x[0],y[0]) = z[0]
	// u(x[1],y[1]) = z[1]
	// ...

	// x.length = y.length
	
	double[] z = new double[x.length];
	
	for (int i = 0; i < x.length; i++) {
	    z[i] = 100*Math.sin((Math.PI/this.l)*x[i])*Math.cos((Math.PI/this.l)*y[i]);
	}

	return z;
    }
}
