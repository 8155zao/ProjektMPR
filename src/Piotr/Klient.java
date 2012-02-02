package Piotr;

public class Klient {

private int Numer_klienta;
private String Imie;
private String Nazwisko;


public Klient(int numer_klienta, String imie, String nazwisko) {
this.Numer_klienta = numer_klienta;
this.Imie = imie;
this.Nazwisko = nazwisko;
}
  


public int getNumer_klienta() {
return Numer_klienta;
}

public void setNumer_klienta(int numer_klienta) {
Numer_klienta = numer_klienta;
}

public String getImie() {
return Imie;
}

public void setImie(String imie) {
Imie = imie;
}

public String getNazwisko() {
return Nazwisko;
}

public void setNazwisko(String nazwisko) {
Nazwisko = nazwisko;
}

public void pokazKlienta(){
System.out.println("Numer klienta: " + Numer_klienta + " Imiê i Nazwisko " + Imie + " " + Nazwisko);
}



}