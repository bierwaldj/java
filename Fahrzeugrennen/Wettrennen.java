package Fahrzeugrennen;

public class Wettrennen {
	public static void main(String[] args) {
		
		//Fahrzeug jeden Typs erzeugen
		Fahrzeug fahrrad1 = new Fahrrad();
		Fahrzeug auto1 = new Auto();
		Fahrzeug rennwagen1 = new Rennwagen();
		Fahrzeug krankenwagen1 = new Krankenwagen();
		
		//Fahrzeug Speed setzen
		fahrrad1.setGeschwindigkeit(20);
		auto1.setGeschwindigkeit(150);
		rennwagen1.setGeschwindigkeit(200);
		krankenwagen1.setGeschwindigkeit(80);
		
		// bewege() - alle Fahrzeuge (einzeln)
		// Fahrrad Vorsprung 4 Stunden (Zeitdauer + 4*60)
		// bewege() 1 stunde (60)
		fahrrad1.bewege(60+60*4);
		auto1.bewege(60);
		rennwagen1.bewege(60);
		krankenwagen1.bewege(60);
		
		// Ausgabe
		// Position aller Fahrzeuge
		System.out.println();
		System.out.println("Fahrrad Kilometerstand: " + fahrrad1.getPosition());
		System.out.println("Auto Kilometerstand: " +  auto1.getPosition());
		System.out.println("Rennwagen Kilometerstand: " +  rennwagen1.getPosition());
		System.out.println("Krankenwagen Kilometerstand: " +  krankenwagen1.getPosition());
	}
}
