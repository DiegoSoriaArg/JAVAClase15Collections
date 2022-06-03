package torneodearqueria;

import java.io.FileNotFoundException;

public class ArquerosArgentinos {

	public static void main(String[] args) throws FileNotFoundException {
		Torneo arqueritosDelSur = new Torneo("1000tiros.csv");
		arqueritosDelSur.getSalida();
	}

}
