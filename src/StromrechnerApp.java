import java.util.Date;

/**
 * 
 */

/**
 * @author thomas
 *
 */
public class StromrechnerApp {

	
	public static void main(String[] args) {
		
		Geraet test = new Geraet();
		test.setName("Fön");
		test.setLeistung(300);
		test.setKlasse(new Geraeteklasse("Zubehör"));
		test.setVerbrauch(400);
		test.setTimestamp(new Date());
		
		System.out.println("Das neue Geraet ist: " + test.getName() + " aus der Klasse: " + test.getKlasse().getName());
		System.out.println("Es hat eine Leistung von " + test.getLeistung());
		System.out.println("Es hat einen Verbrauch von " + test.getVerbrauch());
		System.out.println("Es hat einen Timestamp von " + test.getTimestamp());
		
		
		
		
	}

}

