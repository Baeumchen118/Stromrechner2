/**
 * 
 */

/**
 * @author thomas
 *
 */
public class StromVerbrauchApp {

	
	public static void main(String[] args) {


		
		Geraet test = new Geraet("Fön", "Badezimmer", 0.03);
		test.setBeginMessung(2016, 07, 01, 00, 0);
		test.setEndeMessung(2016, 07, 10, 24, 00);
		System.out.println(test.getZeit());
		System.out.println(test.getLeistung() + " Kilowatt mal " + test.getZeit() + " Stunden und " + test.kwhPreis +
				" ct sind " + test.berechneVerbrauch() + " Euro");

		test.setBeginMessung(2016, 07, 01, 00, 0);
		test.setEndeMessung(2016, 07, 20, 24, 00);

		System.out.println(test.getZeit());
		System.out.println(test.getLeistung() + " Kilowatt mal " + test.getZeit() + " Stunden und " + test.kwhPreis +
				" ct sind " + test.berechneVerbrauch() + " Euro");





	}

}

