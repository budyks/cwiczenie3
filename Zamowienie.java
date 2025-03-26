
    public class Zamowienie {
        private int id;
        private Klient klient;
        private String dataZamowienia;
        private String status;
        private Produkt[] produkty;
        private int[] ilosc;

        public Zamowienie(int id, Klient klient, Produkt[] produkty, int[] ilosci) {
            this.id = id;
            this.klient = klient;
            this.produkty = produkty;
            this.ilosc = ilosci;
            this.dataZamowienia = dataZamowienia;
            this.status = status;
        }


        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public Klient getKlient() { return klient; }
        public void setKlient(Klient klient) { this.klient = klient; }

        public Produkt[] getProdukty() { return produkty; }
        public void setProdukty(Produkt[] produkty) { this.produkty = produkty; }

        public int[] getIlosc() { return ilosc; }
        public void setIlosc(int[] ilosci) { this.ilosc = ilosc; }

        public String getDataZamowienia() { return dataZamowienia; }
        public void setDataZamowienia(String dataZamowienia) { this.dataZamowienia = dataZamowienia; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }




        public int obliczWartoscZamowienia(){
            int wartoscZamowienia= 0;
            for (int i=produkty.length; i > 0; i--){
                wartoscZamowienia = wartoscZamowienia + (int)(produkty[i-1].getCena() * ilosc[i-1]);
            }

            return wartoscZamowienia;
        }
        public double zastosujZnizke(){
            double wartosc = obliczWartoscZamowienia();
            if (getKlient().isCzyStaly()){
                wartosc *= 0.9;
            }

            return wartosc;
        }
        public void wyswietlSzczegoly(){
            System.out.println("Numer zamówienia: " + "#" + id + " Złożone dnia " + dataZamowienia);
            System.out.println("Dane zamawiającego: "); klient.wyswietlInfromacje();
            System.out.println("Produkty: ");

            for (int i=produkty.length; i > 0; i--){
                System.out.println("Nazwa produktu: "+ produkty[i-1].getNazwa());
                System.out.println("Kategoria produktu: "+ produkty[i-1].getKategoria());
                System.out.println("Cena produktu: "+ produkty[i-1].getCena());
                System.out.println("Ilość produktu: "+ ilosc[i-1]);
            }
            System.out.println("Status zamówienia " + status);
            System.out.println("Wartość zamówienia " + obliczWartoscZamowienia() + "zł");
            if (klient.isCzyStaly()){
                System.out.println("Cena po zniżce " + zastosujZnizke() + "zł");
            }

            }
        }




