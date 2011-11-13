package Piotr;

public class Film {

	private String Tytul;
	private int Rok_wydania;
	private String Gatunek;
	
	
	public Film(String tytul, String gatunek, int rok_wydania) {
		this.Tytul = tytul;
		this.Rok_wydania = rok_wydania;
		this.Gatunek = gatunek;
	}
	
	public String getTytul() {
		return Tytul;
	}
	public void setTytul(String tytul) {
		Tytul = tytul;
	}
	public int getRok_wydania() {
		return Rok_wydania;
	}
	public void setRok_wydania(int rok_wydania) {
		Rok_wydania = rok_wydania;
	}
	public String getGatunek() {
		return Gatunek;
	}
	public void setGatunek(String gatunek) {
		this.Gatunek = gatunek;
	}
	
	public void pokazFilm(){
		System.out.println("Tytu³: " + Tytul + " Gatunek: " + Gatunek + " Rok wydania: " + Rok_wydania);
	}
}
