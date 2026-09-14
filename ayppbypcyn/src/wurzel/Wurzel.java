package wurzel;

import imaginaer.Imaginaer;

// Die Wurzel des Polynoms
// ax^2 + bx + c =  0
public class Wurzel {

    public double a;
    public double b;
    public double c;

    public Wurzel(double eina, double einb, double einc) {
	this.a = eina;
	this.b = einb;
	this.c = einc;
    }

    public double discriminant() {
	return (this.b * this.b - 4 * this.a * this.c);
    }

    // Berechne den Wurzel wenn das Discriminant unten Null ist.
    //
    // aus: [r0, s0] wo r1, r2 = r0 +- i*s0
    //
    public double[] wurzeluntennull() {
	if (this.discriminant() >= 0) {
	    System.out.println("wurzeluntennull: aber... disc >= 0");
	}

	// r0 = -b/2a
	double rnull = -1.0 * this.b / (2.0 * this.a);

	// s0 = (1/2a)(b^2-4ac)^(1/2)
	double snull = (1.0 / (2.0 * this.a)) * Math.sqrt(-1 * this.discriminant());

	// Ich glaube, daß das Augeben der zwei neuen imaginären
	// Zahlen zu kompliziert sind. Gib einfach nur r0 and s0 aus.
	return new double[] {rnull, snull};
    }

    // Berechne den Wurzel, wenn das Discriminant gleich Null ist.
    public double wurzelgleichnull() {

	if (this.discriminant() != 0) {
	    System.out.println("wurzelgleichnull: aber... disc != 0");
	}
	
	// Es gibt zwei Wurzeln und die sind gleich.
	// r1 = r2 = -b/(2a)
	return (-1.0 * this.b) / (2.0 * this.a);
    }

    // Berechne den Wurzel, wenn das Discriminant oben Null ist.
    public double[] wurzelobennull() {

	if (this.discriminant() <= 0) {
	    System.out.println("wurzelobennull: aber... disc <= 0");
	}

	double reins = (1.0 / (2.0 * this.a)) * (-1.0 * this.b
						 + Math.sqrt(this.discriminant()));

	double rzwei = (1.0 / (2.0 * this.a)) * (-1.0 * this.b
						 - Math.sqrt(this.discriminant()));

	return new double[] {reins, rzwei};
    }
}
