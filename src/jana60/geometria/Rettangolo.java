package jana60.geometria;

public class Rettangolo {

	// attributi

	int base;
	int altezza;

	// costruttori
	/*
	 * Rettangolo(int base, int altezza) { this.base = base; this.altezza = altezza;
	 * } quando chiamo il costruttore qui poi nella classe main non posso fare
	 * semplicemente new Rettangolo(); ma devo mettere nelle () le variabili
	 * dichiarate qui quindi: new Rettangolo (base, altezza);
	 */

	// calcolo perimetro
	int calcolaPerimetro() {
		int perimetro = (base + altezza) * 2;
		return perimetro;

	}

	// calcolo area

	int calcoloArea() {
		int area = base * altezza;
		return area;
	}

}
