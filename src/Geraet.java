import java.util.GregorianCalendar;

/**
 * @author Thomas Kleebaum-Nagy
 *
 */
public class Geraet {

	// Attribute
	private String name;
	private int leistung;
	private Geraeteklasse klasse;
	private Verbrauch verbrauch;


	// No-Arg-Konstruktor
	public Geraet(){
		
	};


	// Konstruktor
	public Geraet(String name, int leistung, Geraeteklasse klasse, Verbrauch verbrauch) {

		setGeraeteName(name);

		if (getLeistung() > 0){
			this.leistung = leistung;
		}

		this.klasse = klasse;
		this.verbrauch = verbrauch;

	}

	public Geraet(String name, int leistung, String klassenName, int geraeteId, int verbrauch){

		setGeraeteName(name);

		if (getLeistung() > 0){
			this.leistung = leistung;
		}

		setGeraeteKlasse(klassenName, geraeteId);


	}

	// Getter u. Setter
	public String getGeraeteName() {

		return name;

	}

	public void setGeraeteName(String name) {

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

	public Geraeteklasse getGeraeteKlasse() {
		return klasse;
	}

	public void setGeraeteKlasse(String geraeteName, int geraeteId) {

		this.klasse = new Geraeteklasse(geraeteName, geraeteId);

	}




}
