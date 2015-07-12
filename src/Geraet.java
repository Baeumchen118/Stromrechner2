

import java.util.Date;
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
	
	
	// No-Arg-Konstruktor
	public Geraet(){
		
	};
	
		
	
	// Konstruktor
	public Geraet(String name, int leistung, Geraeteklasse klasse, int verbrauch, GregorianCalendar beginnMessung, GregorianCalendar endeMessung){
		
		this.setName(name);
		
		if (getLeistung() > 0){
			this.leistung = leistung;
		}
		
		this.setKlasse(klasse);
		
		this.setVerbrauch(verbrauch);
		
		this.setBeginnMessung();
		
		this.setEndeMessung();
		
		
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
		public void setKlasse(Geraeteklasse klasse) {
			
			this.klasse = klasse;
			
		}
		
		
	
	
}
