public class Autorzy {
    private String imie;
    private String nazwisko;
    private String dataurodzenia;

    public Autorzy(String imie, String nazwisko, String dataurodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(String dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    @Override
    public String toString() {
        return "Autorzy{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataurodzenia='" + dataurodzenia + '\'' +
                '}';
    }
}
