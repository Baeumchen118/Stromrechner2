

import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * @author Thomas Kleebaum-Nagy
 *
 */
public class Geraet {

	// Attribute
	private String name;
	private int leistung;
	private Geraeteklasse klasse;
	private double verbrauch;
	private GregorianCalendar beginMessung;
	private GregorianCalendar endeMessung;



	// No-Arg-Konstruktor
	public Geraet(){
		
	};


	// Konstruktor
	public Geraet(String name, int leistung, Geraeteklasse klasse, int verbrauch) {

		setName(name);

		if (getLeistung() > 0){
			this.leistung = leistung;
		}

		this.klasse = klasse;

		setVerbrauch(verbrauch);

		GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone(ZoneId.systemDefault()));

	}

	public Geraet(String name, int leistung, String klassenName, int geraeteId, int verbrauch){

		setName(name);

		if (getLeistung() > 0){
			this.leistung = leistung;
		}

		setKlasse(klassenName, geraeteId);

		setVerbrauch(verbrauch);



	}

	// Getter u. Setter
	public String getName() {

		return name;

	}


	public void setName(String name) {

		this.name = name;

	}
	public int getLeistung() {

		return leistung;

	}
	public boolean setLeistung(int leistung) {

		if (leistung > 0){
			this.leistung = leistung;
			return true;

		} else {

			return false;
		}
	}
	public Geraeteklasse getKlasse() {
		return klasse;
	}

	public void setKlasse(String geraeteName, int geraeteId) {

		this.klasse = new Geraeteklasse(geraeteName, geraeteId);

	}
	public double getVerbrauch() {
		return verbrauch;
	}


	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public GregorianCalendar getBeginMessung() {
		return beginMessung;
	}

	public void setBeginMessung(GregorianCalendar beginMessung) {
		this.beginMessung = beginMessung;
	}

	public GregorianCalendar getEndeMessung() {
		return endeMessung;
	}

	public void setEndeMessung(GregorianCalendar endeMessung) {
		this.endeMessung = endeMessung;
	}

	
	
}
