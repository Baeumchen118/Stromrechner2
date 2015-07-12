import java.util.GregorianCalendar;

/**
 * @author Thomas Kleebaum-Nagy
 *
 */
public class Verbrauch extends GregorianCalendar{
	
	private int verbrauch = 0;
	private GregorianCalendar beginnMessung = null;
	private GregorianCalendar endeMessung = null;	
	
	public  Verbrauch(GregorianCalendar beginnMessung, GregorianCalendar endeMessung) {
	}
	
	public int getVerbrauch() {
		return verbrauch;
	}
	
	/*public boolean setVerbrauch(int verbrauch) {
		
		if (verbrauch > 0){
			this.verbrauch = verbrauch;
			return true;
		}
		return false;
		
	}*/

	public GregorianCalendar setBeginnMessung() {
		return beginnMessung;
	}

	public void getBeginnMessung(GregorianCalendar beginnMessung) {
		this.beginnMessung = beginnMessung;
	}
	
	public GregorianCalendar setEndeMessung() {
		return endeMessung;
	}

	public void getEndeMessung(GregorianCalendar endeMessung) {
		this.beginnMessung = endeMessung;
	}

}
