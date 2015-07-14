import java.util.GregorianCalendar;

/**
 * @author Thomas Kleebaum-Nagy
 *
 */
public class Geraet {

	// Attribute
	private String name;
	private Geraeteklasse klasse;
	private GregorianCalendar messungbeginn;
	private GregorianCalendar messungEnde;
	private double verbrauch;
	private double zeitInStunden;
	private double leistungsaufnahme;
	public double kwhPreis = 0.0223;



	// No-Arg-Konstruktor
	public Geraet(){
		
	};


	// Konstruktor

	public Geraet(String name, double leistungsaufnahme, Geraeteklasse klasse) {

		setGeraeteName(name);

		if (getLeistung() > 0){
			this.leistungsaufnahme = leistungsaufnahme;
		}

		this.klasse = klasse;


	}

	public Geraet(String name, String klassenName, double leistungsaufnahme){

		setGeraeteName(name);

		setGeraeteKlasse(klassenName);

		setLeistung(leistungsaufnahme);

	}

	// Getter u. Setter
	public String getGeraeteName() {

		return name;

	}

	public void setGeraeteName(String name) {

		this.name = name;

	}

	public double getLeistung() {

		return leistungsaufnahme;

	}

	public boolean setLeistung(double leistungsaufnahme) {

		if (leistungsaufnahme > 0){
			this.leistungsaufnahme = leistungsaufnahme;

			return true;

		} else {

			return false;
		}
	}

	public Geraeteklasse getGeraeteKlasse() {
		return klasse;
	}

	public void setGeraeteKlasse(String geraeteName) {

		this.klasse = new Geraeteklasse(geraeteName);

	}


	public void setBeginMessung(int year, int month, int date,	 int hour, int minute){

		GregorianCalendar cal1 = new GregorianCalendar(year, month, date, hour,  minute);

		this.messungbeginn = cal1;

	};

	public void setEndeMessung(int year, int month, int date, int hour, int minute){

		GregorianCalendar cal2 = new GregorianCalendar(year, month, date, hour,  minute);

		this.messungEnde = cal2;

	}

	public double getZeit(){

		double zeitInStunden = ((messungEnde.getTimeInMillis() - messungbeginn.getTimeInMillis()) / 3600000);
		return zeitInStunden;
	}

	public double berechneZeit(){

		zeitInStunden = ((messungEnde.getTimeInMillis() - messungbeginn.getTimeInMillis()) / 3600000);

		return zeitInStunden;
	}

	public double berechneVerbrauch(){

		verbrauch = Math.round(berechneZeit() * leistungsaufnahme * (kwhPreis ) * 100.0) / 100.0 ;
		return verbrauch;
	}
}
