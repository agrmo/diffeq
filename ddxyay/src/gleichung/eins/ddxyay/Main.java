package gleichung.eins.ddxyay;

import zahl.eins.Zahlenreihe;

// java -cp classes gleichung.eins.ddxyay.Main;

public class Main {
    static void beispieleins() {

	double[] x = Zahlenreihe.reihe(0, 10, 30);
	double[] y = Ddxyay.nehmey(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println("[" + x[i] + ", " + y[i] + "]");
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
