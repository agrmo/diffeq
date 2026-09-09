package gleichung.eins.ddxyay;

public class Ddxyay {

    static double[] nehmey(double[] x) {
	double[] y = new double[x.length];
	
	for (int i = 0; i < x.length; i++) {
	    y[i] = 2.0 * Math.exp(-3.0 * x[i]);
	}

	return y;
    }
}
