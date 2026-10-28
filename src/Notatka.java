public class Notatka {
    private static int licznikNotatek;
    private final int id;
    protected String tytulNotatki, trescNotatki;


    public Notatka(String tytulNotatki, String trescNotatki) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
        licznikNotatek++;
        id = licznikNotatek;
    }

    public void wyswietlTytulTrescNotatki(){
            String stringTytul = tytulNotatki;
            String stringTresc = trescNotatki;
            System.out.println("Tytuł: " + stringTytul + " " + stringTresc);


    }
    public void wyswietlZawartosc(){
        System.out.println(licznikNotatek + ", " + id + ", " + tytulNotatki + trescNotatki );
    }

}
