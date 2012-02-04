package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Piotr.Film;
import Piotr.Klient;
import Piotr.Wypozyczalnia;


public class WypozyczalniaTest {
	private List<Klient> klient= new ArrayList<Klient>();
	private List<Film> film= new ArrayList<Film>();
	private Wypozyczalnia Test = new Wypozyczalnia ("Test", film, klient);


	@Before
	public void setUp() throws Exception {
		klient.add(new Klient(1, "imie1", "nazwisko1"));
		klient.add(new Klient(2, "imie2", "nazwisko2"));
		klient.add(new Klient(3, "imie3", "nazwisko3"));
		film.add(new Film ("tytul1", "gatunek1", 1990));
		film.add(new Film ("tytul2", "gatunek2", 1991));
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWypozyczalnia() {
		assertTrue(Test.getNazwa().equals("Test"));
		assertSame(Test.getKlienci(), klient);
		assertEquals(Test.getFilmy(), film);
	}

	@Test
	public void testGetNazwa() {
		assertTrue(Test.getNazwa().equals("Test"));
	}

	@Test
	public void testSetNazwa() {
		Test.setNazwa("Test1");
		assertTrue(Test.getNazwa().equals("Test1"));
		assertSame("Test1", Test.getNazwa());
	}

	@Test
	public void testGetFilmy() {
		assertTrue(Test.getFilmy().equals(film));
		
	}

	@Test
	public void testSetFilmy() {
		Test.setFilmy(film);
		assertSame(film, Test.getFilmy());
		assertEquals(Test.getFilmy(), film);
	}

	@Test
	public void testGetKlienci() {
		assertTrue(Test.getKlienci().equals(klient));
	}

	@Test
	public void testSetKlienci() {
		Test.setKlienci(klient);
		assertTrue(Test.getKlienci().equals(klient));
		assertEquals(Test.getKlienci(), klient);
	}

	@Test
	public void testDodajFilm() {
		assertTrue(film.size()==2);
	}

	@Test
	public void testDodajKlient() {
		assertFalse(klient.size()==1);
		assertTrue(klient.size()==3);

	}

	@Test
	public void testWyswietlFilmy() {
		assertFalse(film.size()==1);
		assertTrue(film.size()==2);
		
	}

	@Test
	public void testWyswietlKlienci() {
		assertFalse(klient.size()==4);
		assertTrue(klient.size()==3);
	}

	@Test
	public void testZnajdzFilm() {
		assertNull(Test.znajdzFilm("imie1"));
		assertNotNull(Test.znajdzFilm("tytul1"));
	}

	@Test
	public void testZnajdzFilm_po_gatunku() {
		assertNull(Test.znajdzFilm_po_gatunku("gatunek3"));
		assertNotNull(Test.znajdzFilm_po_gatunku("gatunek1"));
	}

	@Test
	public void testZnajdzKlienta() {
		assertNotNull(Test.znajdzKlienta("nazwisko1"));
	}

	@Test
	public void testUsunFilm() {
		Test.usunFilm("tytul2");
		assertTrue(film.size()==1);
	}

	@Test
	public void testUsunKlient() {
		Test.usunKlient("nazwisko2");
		assertTrue(klient.size()==2);
	}

	@Test
	public void testZmienFilm() {
		Test.zmienFilm("tytul1", "gatunek1", 1990, "nowy_tytul", "gatunek1", 1991);
		assertNotSame("nowy_tytul1", Test.znajdzFilm("nowy_tytul").getTytul());
		assertTrue(film.get(0).getTytul()=="nowy_tytul");
		
	}

	@Test
	public void testZmienKlient() {
		Test.zmienKlient(1, "imie1", "nazwisko1", 2, "nowe_imie", "nazwisko1");
		assertFalse(klient.get(0).getImie()=="imie1");
		assertTrue(klient.get(0).getNumer_klienta()==2);
		assertSame("nowe_imie", Test.znajdzKlienta("nazwisko1").getImie());
	}

	@Test
	public void testPokazFilmy_po_gatunku() {
		assertFalse(film.size()==1);
		assertTrue(film.size()==2);
	}



}
