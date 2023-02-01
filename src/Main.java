import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    static List<Ksiazki> ksiazka = new ArrayList<>();
    static private String tytul;
    static private String kategoria;
    static private String datawydania;
    static private int iloscStron;
    static private double cena;
    static private String autorim;
    static private String autornaz;
    static private String autorbrth;
    static private String fullautorname;
    static private int znalezione;
    static private String wybor;
    static private String wyborin;
    static private Scanner in = new Scanner(System.in);



    public static void main(String[] args) {
        ksiazka.add(new Ksiazki("lalka","super","12-03-1900",12,123,new Autorzy("lalim","lalnaz", "08-02-1860")));
        ksiazka.add(new Ksiazki("hitman","akcja","14-05-2019",200,2500,new Autorzy("hitim","hitnaz", "03-05-1990")));
        ksiazka.add(new Ksiazki("planeta skarbow","giga super","12-07-2000",1735,100000,new Autorzy("platim","platnazw", "12-07-1970")));
        menu();
    }
    public static void menu(){
        System.out.println("1. Dodanie nowej ksiazki");
        System.out.println("2. Usuniecie ksiazki");
        System.out.println("3. Wyszukanie ksiazki");

        int wybor=in.nextInt();

        if (wybor==1){
            dodaj();
        }
        else if (wybor==2) {
            usun();
        }
        else if (wybor==3) {
            znajdz();
        }
    }

    public static void dodaj(){
        System.out.println("Podaj tytul:");
        tytul = "";
        while(tytul.isEmpty()) {
            tytul = in.nextLine();
        }
        System.out.println("Podaj imie autora:");
        autorim = "";
        while(autorim.isEmpty()) {
            autorim = in.nextLine();
        }
        System.out.println("Podaj nazwisko autora:");
        autornaz = "";
        while(autornaz.isEmpty()) {
            autornaz = in.nextLine();
        }
        System.out.println("Podaj date urodzenia autora(dd-mm-yyyy):");
        autorbrth = "";
        while(autorbrth.isEmpty()){
            autorbrth = in.nextLine();
        }
        System.out.println("Podaj kategorie:");
        kategoria = "";
        while(kategoria.isEmpty()) {
            kategoria = in.nextLine();
        }
        //dodać aby wprowadzało się osobno dzień miesiąc i rok i reguły poprawności
        System.out.println("Podaj date wydania(dd-mm-yyyy):");
        datawydania = "";
        while(datawydania.isEmpty()) {
            datawydania = in.nextLine();
        }
        System.out.println("Podaj ilosc stron:");
        iloscStron = in.nextInt();
        System.out.println("Podaj cene:");
        cena = in.nextDouble();


        ksiazka.add(new Ksiazki(tytul, kategoria, datawydania, iloscStron, cena, new Autorzy(autorim,autornaz, autorbrth)));
        System.out.println("-------------------------------------------");
        menu();
    }
    public static void usun(){
        znalezione=0;
        wybor="";
        wyborin="";

        System.out.println("-------------------------------------------");
        System.out.println("Podaj tytul ksiazki jaka chcesz usunac:");
        tytul="";
        while(tytul.isEmpty()) {
            tytul = in.nextLine();
        }
        for (Ksiazki i:ksiazka) {
            if (tytul.equalsIgnoreCase(i.getTytul())){
                ksiazka.remove(i);
                znalezione=1;
                break;
            }
        }
        if (znalezione!=1){
            System.out.println("Nie ma takiej ksiazki!!!");
            System.out.println("-------------------------------------------");
            System.out.println();
            while (Objects.equals(wyborin, "")){
                System.out.println("1. Sprobuj ponownie");
                System.out.println("2. Wroc do menu");
                System.out.println("3. Zakoncz");
                wyborin = in.nextLine();
                if (Objects.equals(wyborin, "1")){
                    znajdz();
                }
                else if (Objects.equals(wyborin, "2")){
                    System.out.println("-------------------------------------------");
                    menu();
                }
                else if(Objects.equals(wyborin, "3")){
                    return;
                }
                else{
                    wyborin="";
                    System.out.println("Zla wartosc!!!");
                }
            }
        }
        while (Objects.equals(wybor, "")){
            System.out.println();
            System.out.println("1. Wroc do menu");
            System.out.println("2. Zakoncz");
            while(wybor.isEmpty()) {
                wybor = in.nextLine();
            }
            if(Objects.equals(wybor, "1")){
                System.out.println("-------------------------------------------");
                menu();
            }
            else if(Objects.equals(wybor, "2")){
                return;
            }
            else{
                wybor="";
                System.out.println("Podano zla wartosc!!!");
            }
        }
        System.out.println("-------------------------------------------");
        menu();
    }
    public static void znajdz(){
        znalezione=0;
        wybor="";
        wyborin="";

        System.out.println("-------------------------------------------");
        System.out.println("Podaj tytul lub autora ksiazki:");
        tytul="";
        while(tytul.isEmpty()) {
            tytul = in.nextLine();
        }
        //dodać aby była wyświetlana możliwie jedna książka a jak więcej to wybrać z listy
        //Objects.equals(tytul, i.getAutor().getImie()) || Objects.equals(tytul, i.getAutor().getNazwisko()) || Objects.equals(tytul, i.getAutor().getImie() + " " + i.getAutor().getNazwisko())
        for (Ksiazki i:ksiazka) {
            if (tytul.equalsIgnoreCase(i.getTytul())){
                System.out.println("Tytul: "+i.getTytul());
                System.out.println("Kategoria: "+i.getKategoria());
                System.out.println("Autor: "+i.getAutor().getImie()+""+i.getAutor().getNazwisko());
                System.out.println("Data wydania: "+i.getDatawydania());
                System.out.println("Ilosc stron: "+i.getIloscStron());
                System.out.println("Cena: "+i.getCena());
                znalezione=1;
                break;
            }
            else if (tytul.equalsIgnoreCase(i.getAutor().getImie()) || tytul.equalsIgnoreCase(i.getAutor().getNazwisko()) || tytul.equalsIgnoreCase(i.getAutor().getImie()+" "+i.getAutor().getNazwisko())){
                System.out.println("Tytul: "+i.getTytul());
                System.out.println("Kategoria: "+i.getKategoria());
                System.out.println("Autor: "+i.getAutor().getImie()+" "+i.getAutor().getNazwisko());
                System.out.println("Data wydania: "+i.getDatawydania());
                System.out.println("Ilosc stron: "+i.getIloscStron());
                System.out.println("Cena: "+i.getCena());
                znalezione=1;
                break;
            }
        }
        if (znalezione!=1){
            System.out.println("Nie ma takiej ksiazki!!!");
            System.out.println("-------------------------------------------");
            System.out.println();
            while (Objects.equals(wyborin, "")){
                System.out.println("1. Sprobuj ponownie");
                System.out.println("2. Wroc do menu");
                System.out.println("3. Zakoncz");
                wyborin = in.nextLine();
                if (Objects.equals(wyborin, "1")){
                    znajdz();
                }
                else if (Objects.equals(wyborin, "2")){
                    System.out.println("-------------------------------------------");
                    menu();
                }
                else if(Objects.equals(wyborin, "3")){
                    return;
                }
                else{
                    wyborin="";
                    System.out.println("Zla wartosc!!!");
                }
            }
        }
        while (Objects.equals(wybor, "")){
            System.out.println();
            System.out.println("1. Wroc do menu");
            System.out.println("2. Zakoncz");
            while(wybor.isEmpty()) {
                wybor = in.nextLine();
            }
            if(Objects.equals(wybor, "1")){
                System.out.println("-------------------------------------------");
                menu();
            }
            else if(Objects.equals(wybor, "2")){
                return;
            }
            else{
                wybor="";
                System.out.println("Podano zla wartosc!!!");
            }
        }
    }
}
//{}