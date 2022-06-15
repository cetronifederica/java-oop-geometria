package jana60.geometria;

import java.util.Scanner;

public class MainBonus {

	public static void main(String[] args) {
		// chiedere all'utente per 5 volte di inserire le dimensioni del rettangolo e
		// stampare a video l'area del rettangolo più grande

		Scanner scan = new Scanner(System.in);
		Rettangolo ret = new Rettangolo();
		Rettangolo rettMax = new Rettangolo();
		int retGrande = 0; // in questo modo partirà sempre da zero

		for (int i = 0; i < 5; i++) {
			System.out.println("Rettangolo " + (i + 1));
			System.out.println("base: ");
			ret.base = scan.nextInt();
			System.out.println("altezza: ");
			ret.altezza = scan.nextInt();
			if (ret.calcoloArea() >= retGrande) {
				retGrande = ret.calcoloArea();
				rettMax.altezza = ret.altezza;
				rettMax.base = ret.base;

			}
		}
		System.out.println("L'area del rettangolo più grande è: " + rettMax.calcoloArea());

		scan.close();
	}

}
