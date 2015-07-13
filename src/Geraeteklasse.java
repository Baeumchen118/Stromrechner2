
public class Geraeteklasse {
	
	private String name;
	private int geraeteId;

	
	public Geraeteklasse(){
		
	}
	
	public Geraeteklasse(String name, int geraeteId) {
	
		this.name = name;
		this.geraeteId = geraeteId;
	}

	public String getKlasseName() {
		return name;
	}

	public void setKlasseName(String name) {
		this.name = name;
	}

	public int getGeraeteId() {
		return geraeteId;
	}

	public void setGeraeteId(int geraeteId) {
		this.geraeteId = geraeteId;
	}
}


