package jana60.geometria.bonus;

import java.util.Scanner;

public class MainBonus {

	public static void main(String[] args) {
		// chiedere all'utente per 5 volte di inserire le dimensioni del rettangolo e
		// stampare a video l'area del rettangolo più grande

		Scanner scan = new Scanner(System.in);
		RettangoloBonus ret = new RettangoloBonus();
		int retGrande = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Scrivimi il valore della base di un rettangolo: ");
			ret.base = scan.nextInt();
			System.out.println("Scrivimi il valore dell'altezza di un rettangolo: ");
			ret.altezza = scan.nextInt();
		}
		System.out.println("L'area del rettangolo più grande è: " + ret.calcoloArea());
	}

}
