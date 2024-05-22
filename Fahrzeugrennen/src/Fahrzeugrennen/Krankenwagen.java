package Fahrzeugrennen;

public class Krankenwagen extends Auto{
	private boolean blaulicht = false;
	
	public Krankenwagen() {
		
	}
	public boolean getBlaulicht() {
		return this.blaulicht;
	}
	public void setBlaulicht() {
		if(this.blaulicht) {
			this.blaulicht = false;	
		}
		else {
			this.blaulicht = true;
		}
		
	}
}
