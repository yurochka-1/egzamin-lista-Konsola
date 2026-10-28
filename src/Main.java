import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Notatka notatka = new Notatka("Zakupy: ", "chleb, ziemiaki, masło.");
        System.out.println("Notatka 1");
        notatka.wyswietlTytulTrescNotatki();
        notatka.wyswietlZawartosc();
        Notatka notatka1 = new Notatka("Filmy do oglądania: ", "Farest Gamp, Avengers, KungFu Panda");
        System.out.println("Notatka 2");
        notatka1.wyswietlTytulTrescNotatki();
        notatka1.wyswietlZawartosc();
    }
}