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
najlepsza.dodajFilm("Krąg", "Horror", 2001);

najlepsza.dodajKlient(1, "Władysław", "Bierut");
najlepsza.dodajKlient(2, "Przemysław", "Bobek");
najlepsza.dodajKlient(3, "Piotr", "Bierut");

najlepsza.wyswietlFilmy();
najlepsza.wyswietlKlienci();
najlepsza.pokazFilmy_po_gatunku(najlepsza.znajdzFilm_po_gatunku("S-F"));


najlepsza.usunKlient("Bobek");
najlepsza.usunFilm("Wyprawa na marsa");

najlepsza.wyswietlFilmy();
najlepsza.wyswietlKlienci();

najlepsza.zmienFilm("Krąg", "Horror", 2001, "Krąg","Horror", 2003 );
najlepsza.zmienFilm("Gwiezdne wojny", "Komedia", 1976,"Gwiezdne Wojny", "Komedia", 1980 );
najlepsza.zmienKlient(11, "Władysław", "Bierut", 11, "Władysław", "Gomułka");


najlepsza.wyswietlFilmy();
najlepsza.wyswietlKlienci();
}
}