public class Ksiazki {
    private String tytul;
    private String kategoria;
    private String datawydania;
    private int iloscStron;
    private double cena;
    private Autorzy autor;

    public Ksiazki(String tytul, String kategoria, String datawydania, int iloscStron, double cena, Autorzy autor) {
        this.tytul = tytul;
        this.kategoria = kategoria;
        this.datawydania = datawydania;
        this.iloscStron = iloscStron;
        this.cena = cena;
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getDatawydania() {
        return datawydania;
    }

    public void setDatawydania(String datawydania) {
        this.datawydania = datawydania;
    }

    public int getIloscStron() {
        return iloscStron;
    }

    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Autorzy getAutor() {
        return autor;
    }

    public void setAutor(Autorzy autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Ksiazki{" +
                "tytul='" + tytul + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", datawydania='" + datawydania + '\'' +
                ", iloscStron=" + iloscStron +
                ", cena=" + cena +
                ", autor=" + autor +
                '}';
    }
}
//{}