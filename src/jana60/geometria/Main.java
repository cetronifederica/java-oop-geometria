package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// chiedere all'utente di inserire i valori di base e altezza
		// dopo aver istanziato stampare a video il perimetro e l'altezza
		Rettangolo ret = new Rettangolo();

		Scanner scan = new Scanner(System.in);
		System.out.println("Scrivimi il valore della base di un rettangolo: ");
		ret.base = scan.nextInt();

		System.out.println("Scrivimi il valore dell'altezza di un rettangolo: ");
		ret.altezza = scan.nextInt();

		System.out.println("Il perimetro del rettangolo è: " + ret.calcolaPerimetro());
		System.out.println("L'area del rettangolo è: " + ret.calcoloArea());
	}

}
