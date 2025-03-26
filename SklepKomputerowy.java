import java.util.Arrays;

public class SklepKomputerowy {
    private Produkt[] produkty;
    private Klient[] klienci;
    private Zamowienie[] zamowienia;
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;

    public SklepKomputerowy() {
        this.produkty = new Produkt[0];
        this.klienci = new Klient[0];
        this.zamowienia = new Zamowienie[0];
    }

    public int getLiczbaKlientow() {
        return liczbaKlientow;
    }

    public void setLiczbaKlientow(int liczbaKlientow) {
        this.liczbaKlientow = liczbaKlientow;
    }

    public int getLiczbaProduktow() {
        return liczbaProduktow;

    }

    public void setLiczbaProduktow(int liczbaProduktow) {
        this.liczbaProduktow = liczbaProduktow;
    }

    public int getLiczbaZamowien() {
        return liczbaZamowien;
    }

    public void setLiczbaZamowien(int liczbaZamowien) {
        this.liczbaZamowien = liczbaZamowien;
    }

    public Klient[] getKlienci() {
        return klienci;
    }

    public void setKlienci(Klient[] klienci) {
        this.klienci = klienci;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public Zamowienie[] getZamowienia() {
        return zamowienia;
    }

    public void setZamowienia(Zamowienie[] zamowienia) {
        this.zamowienia = zamowienia;
    }

    public void dodajProdukt(Produkt nowyProdukt) {
        Produkt[] noweProdukty = new Produkt[produkty.length + 1];
        System.arraycopy(produkty, 0, noweProdukty, 0, produkty.length);
        noweProdukty[produkty.length] = nowyProdukt;
        produkty = noweProdukty;
    }

    public void dodajKlienta(Klient nowyKlient) {
        Klient[] nowiKlienci = new Klient[klienci.length + 1];
        System.arraycopy(klienci, 0, nowiKlienci, 0, klienci.length);
        nowiKlienci[klienci.length] = nowyKlient;
        klienci = nowiKlienci;
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produktyZamowienia, int[] ilosci) {
        int noweId = liczbaZamowien + 1;
        return new Zamowienie(noweId, klient, produktyZamowienia, ilosci);
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        int suma = 0;
        for (int ilosc : zamowienie.getIlosc()) {
            suma += ilosc;
        }
        this.liczbaProduktow = this.liczbaProduktow - suma;
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zamowienie : this.zamowienia) {
            if (zamowienie.getId() == idZamowienia) {
                zamowienie.setStatus(nowyStatus);
            }
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        for (Produkt produkt : this.produkty) {
            if (produkt.getKategoria().equals(kategoria)) {
                System.out.println("Nazwa produktu: " + produkt.getNazwa());
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        for (Zamowienie zamowienie : this.zamowienia) {
            if (zamowienie.getKlient().getId() == idKlienta) {
                System.out.println("Id zamówienia: " + zamowienie.getId() + " dla klienta o id: " + idKlienta);
            }
        }
    }


}
