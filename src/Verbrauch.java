import java.util.GregorianCalendar;

/**
 * @author Thomas Kleebaum-Nagy
 *
 */
public class Verbrauch {
	
	private GregorianCalendar cal1;
	private GregorianCalendar cal2;
	private double verbrauch;


	// Noarg Konstruktor
	public Verbrauch(){

	}

	public Verbrauch(int year, int month, int date,	 int hour, int minute) {

		setBeginMessung(year, month, date, hour, minute);


	};

	public void setBeginMessung(int year, int month, int date,	 int hour, int minute){

		GregorianCalendar cal1 = new GregorianCalendar(year, month, date, hour,  minute);

	};

	public void setEndeMessung(int year, int month, int date, int hour, int minute){

		GregorianCalendar cla2 = new GregorianCalendar(year, month, date, hour,  minute);

	};


	public GregorianCalendar getBeginMessung() {
		cal1.get
	}

	public GregorianCalendar getEndeMessung() {

	}


	public double berechneVerbrauch() {

		cal1.

	}
}
