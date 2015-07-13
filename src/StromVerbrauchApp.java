/**
 * 
 */

/**
 * @author thomas
 *
 */
public class StromVerbrauchApp {

	
	public static void main(String[] args) {

		Geraeteklasse bad = new Geraeteklasse("Badezimmer", 0001);
		
		Geraet test = new Geraet("Rasierer", 333, bad, 3333);
		Geraet test2 = new Geraet("Fön", 300, "saasdasd", 3333, 222);

		System.out.println(test.getGeraeteKlasse().getKlasseName());
		System.out.println(test2.getGeraeteKlasse().getKlasseName());

	}

}

