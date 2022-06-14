package jana60.geometria;

public class Rettangolo {

	// attributi

	int base;
	int altezza;

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
