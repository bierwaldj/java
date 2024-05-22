package Fahrzeugrennen;

public class Fahrzeug {
	protected double position = 0;
	protected double geschwindigkeit = 0;
	protected double maxGeschwindigkeit = 0;
	protected int raeder = 0;
	
		
	public Fahrzeug() {
		
	}
	
	public String toString() {
		return "Position: " + this.position + "\n" +
			   "Speed: " + this.geschwindigkeit + "\n" +
			   "maxSpeed: " + this.maxGeschwindigkeit + "\n" +
			   "Räder: " + this.raeder;
	}
	//Zeitdauer in Minuten
	public void bewege(double zeitdauer) {
		if (this.geschwindigkeit != 0) {
			this.position = this.geschwindigkeit * zeitdauer;
		}		
	}
	public void setGeschwindigkeit(double geschwindigkeit) {
		if(geschwindigkeit <= this.maxGeschwindigkeit) {
		    this.geschwindigkeit = geschwindigkeit;
		}
		else {
			System.out.println("Die eingegebene Geschwindigkeit (" + geschwindigkeit + ") ist höher als die erlaubte maximal-Geschwindigkeit von " + this.getMaxGeschwindigkeit() + " für " + this.getClass().getSimpleName());
			System.out.println("Geschwindigkeit bleibt unverändert bei " + this.geschwindigkeit);
		}
	}
	public double getMaxGeschwindigkeit() {
		return this.maxGeschwindigkeit;
	}
	public int getRaeder() {
		return this.raeder;
	}
	public void setRaeder(int raeder) {
		this.raeder = raeder;
	}
	public double getPosition() {
		return this.position;
	}
}
