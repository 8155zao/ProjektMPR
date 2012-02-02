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

public void dodajFilm(String tytul, String gatunek, int rok_wydania) {
Filmy.add(new Film(tytul, gatunek, rok_wydania));
}

public void dodajKlient(int numer_klienta, String imie, String nazwisko) {
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

public Film znajdzFilm(String tytul){
for(Film f: Filmy){
if (f.getTytul().equals(tytul))
return f;
}
return null;
}

public Film znajdzFilm_po_gatunku(String gatunek){
for(Film f: Filmy){
if (f.getGatunek().equals(gatunek))
return f;
}
return null;
}

public Klient znajdzKlienta(String nazwisko){
for(Klient k: Klienci){
if (k.getNazwisko().equals(nazwisko))
return k;
}
return null;
}

public void usunFilm(String tytul) {
	Filmy.remove(znajdzFilm(tytul));
}

public void usunKlient(String nazwisko) {
	Klienci.remove(znajdzKlienta(nazwisko));
}

public void zmienFilm(String tytul, String gatunek, int rok_wydania, String nowy_tytul, String nowy_gatunek, int nowy_rok_wydania) {
Filmy.set(Filmy.indexOf(znajdzFilm(tytul)), new Film(nowy_tytul, nowy_gatunek, nowy_rok_wydania));
}

public void zmienKlient(int numer_klienta, String imie, String nazwisko, int nowy_numer_klienta, String nowy_imie, String nowy_nazwisko) {
Klienci.set(Klienci.indexOf(znajdzKlienta(nazwisko)), new Klient(nowy_numer_klienta, nowy_imie, nowy_nazwisko));
}

public void pokazFilmy_po_gatunku(Film f) {

for (Film  film: Filmy) {
if (f.getGatunek().equals(film.getGatunek()))
film.pokazFilm();
}
}
}