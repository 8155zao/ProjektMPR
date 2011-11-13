package Piotr;

import java.util.ArrayList;
import java.util.List;


public class Wypozyczalnia {
	
	 private String Nazwa;
	 List<Film> Filmy = new ArrayList<Film>();
	 List<Klient> Klienci = new ArrayList<Klient>();
	
	 public Wypozyczalnia(String nazwa, List<Piotr.Film> film,
			List<Piotr.Klient> klient) {
		this.Nazwa = nazwa;
		Filmy = film;
		Klienci = klient;
	}
	
	public String getNazwa() {
		return Nazwa;
	}

	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}

	public List<Film> getFilmy() {
		return Filmy;
	}

	public void setFilmy(List<Film> filmy) {
		Filmy = filmy;
	}

	public List<Klient> getKlienci() {
		return Klienci;
	}

	public void setKlienci(List<Klient> klienci) {
		Klienci = klienci;
	}
	
	public void dodajFilm(String tytul, String gatunek, int rok_wydania)  {
		 Filmy.add(new Film(tytul, gatunek, rok_wydania));
	}
	
	public void dodajKlient(int numer_klienta, String imie, String nazwisko)  {
		 Klienci.add(new Klient(numer_klienta, imie, nazwisko));
	}
	
	public void wyswietlFilmy(){
		System.out.println("Lista filmów:");
		for(Film f: Filmy){
			f.pokazFilm();
		}
	}
	
	public void wyswietlKlienci(){
		System.out.println("Lista klientów:");
		for(Klient k: Klienci){
			k.pokazKlienta();
		}
	}
	
	public void znajdzFilm_po_tytul(String tytul){
		for(Film f: Filmy)
			if (f.getTytul().equals(tytul))
				f.pokazFilm();
	}
	
	public void znajdzFilm_po_gatunku(String gatunek){
		for(Film f: Filmy)
			if (f.getGatunek().equals(gatunek))
				f.pokazFilm();
	}
	
	public void znajdzKlienta_po_nazwisku(String nazwisko){
		for(Klient k: Klienci)
			if (k.getNazwisko().equals(nazwisko))
				k.pokazKlienta();
	}
	
	public void removeFilm(String tytul) {
		int position = 0;
		for (Film f : Filmy) {
			if (f.getTytul().equals(tytul)) {
				Filmy.remove(position);
				break;
			}
			position++;
		}
	}
	
	public void removeKlient(String nazwisko) {
		int position = 0;
		for (Klient k : Klienci) {
			if (k.getNazwisko().equals(nazwisko)) {
				Klienci.remove(position);
				break;
			}
			position++;
		}
	}
	
	public void zmienFilm_rok_wydania(String tytul, String gatunek, int nowy_rok_wydania) {
		int position = 0;
		for (Film f : Filmy) {
			if (f.getTytul().equals(tytul)) {
				Filmy.set(position, new Film(tytul, gatunek, nowy_rok_wydania));
				break;
			}
			position++;
		}
	}
	
	public void zmienFilm_gatunek(String tytul, String nowy_gatunek, int rok_wydania) {
		int position = 0;
		for (Film f : Filmy) {
			if (f.getTytul().equals(tytul)) {
				Filmy.set(position, new Film(tytul, nowy_gatunek, rok_wydania));
				break;
			}
			position++;
		}
	}
	
	public void zmienKlient_numer (int nowy_numer_klienta, String imie, String nazwisko) {
		int position = 0;
		for (Klient k : Klienci) {
			if (k.getNazwisko().equals(nazwisko)) {
				Klienci.set(position, new Klient(nowy_numer_klienta, imie, nazwisko));
				break;
			}
			position++;
		}
	}
	
	public void zmienKlient_nazwisko (int numer_klienta, String imie, String nowe_nazwisko) {
		int position = 0;
		for (Klient k : Klienci) {
			if (k.getImie().equals(imie)) {
				Klienci.set(position, new Klient(numer_klienta, imie, nowe_nazwisko));
				break;
			}
			position++;
		}
	}


}
