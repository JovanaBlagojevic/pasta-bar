package pasta_bar;

import java.util.Scanner;

public class pasta_bar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] stalneMusterije = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String[] sastojci = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "SLanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };
		int[] cene = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		System.out.println("Izvolite!");
		int racun = 0;
		int i = 0;
		String brojTel = "";
		String presekPorudzbine = "Poruci";
		String nazivSastojaka = "";
		while (!nazivSastojaka.equals(presekPorudzbine)) {
			System.out.println("Izaberite sastojak za pastu: ");
			nazivSastojaka = s.nextLine();
			racun = vracanjeSastojaka(sastojci, nazivSastojaka) + racun;

		}
		System.out.println("Unesite vas broj telefona: ");
		brojTel = s.next();
	}

	public static int vracanjeSastojaka(String[] sastojci, String nazivSastojka) {
		int[] cene = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		for (int i = 0; i < sastojci.length; i++) {
			if (sastojci[i].equals(nazivSastojka)) {
				return cene[i];
			}
		}
		return 0;
	}
}
