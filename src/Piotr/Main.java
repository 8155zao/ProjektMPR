package Piotr;

import java.util.ArrayList;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		
		List<Film> Filmy = new ArrayList<Film>();
		List<Klient> Klienci = new ArrayList<Klient>();
		
		Wypozyczalnia najlepsza = new Wypozyczalnia("najlepsza", Filmy, Klienci);
		
		najlepsza.dodajFilm("Gwiezdne wojny", "S-F", 1976);
		najlepsza.dodajFilm("Wyprawa na marsa", "S-F", 1998);
		najlepsza.dodajFilm("Dwa tygodnie wypowiedzenia", "Komedia", 2005);
		najlepsza.dodajFilm("Kr¹g", "Horror", 2001);
		
		najlepsza.dodajKlient(1, "W³adys³aw", "Bierut");
		najlepsza.dodajKlient(2, "Przemys³aw", "Bobek");
		najlepsza.dodajKlient(3, "Piotr", "Bierut");
		
		najlepsza.wyswietlFilmy();
		najlepsza.wyswietlKlienci();
		najlepsza.znajdzFilm_po_gatunku("S-F");
		najlepsza.znajdzFilm_po_tytul("Kr¹g");
		najlepsza.znajdzKlienta_po_nazwisku("Bierut");
		
		najlepsza.removeKlient("Bobek");
		najlepsza.removeFilm("Wyprawa na marsa");
		
		najlepsza.wyswietlFilmy();
		najlepsza.wyswietlKlienci();
		
		najlepsza.zmienFilm_rok_wydania("Kr¹g", "Horror", 2003);
		najlepsza.zmienFilm_gatunek("Gwiezdne wojny", "Komedia", 1976);
		najlepsza.zmienKlient_nazwisko(11, "W³adys³aw", "Bierut");
		najlepsza.zmienKlient_nazwisko(3, "Piotr", "Waligóra");
		
		najlepsza.wyswietlFilmy();
		najlepsza.wyswietlKlienci();
	}

}
