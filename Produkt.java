
    public class Produkt {
        private int id;
        private String nazwa;
        private String kategoria;
        private double cena;
        private int IloscwMagazynie;


        public void produkt(String nazwa, String kategoria, double cena, int IloscwMagazynie) {
            this.nazwa = nazwa;
            this.kategoria = kategoria;
            this.cena = cena;
            this.IloscwMagazynie = IloscwMagazynie;

        }
        public void WyswietlInfromacje() {
            System.out.println("Nazwa " + nazwa);
            System.out.println("Kategoria " + kategoria);
            System.out.println("Cena " + cena);
            System.out.println("IloscwMagazynie " + IloscwMagazynie);
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNazwa() {
            return nazwa;
        }
        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }
        public String getKategoria() {
            return kategoria;
        }
        public void setKategoria(String kategoria) {
            this.kategoria = kategoria;

        }
        public double getCena() {
            return cena;
        }
        public void setCena(double cena) {
            this.cena = cena;
        }
        public int getIloscwMagazynie() {
            return IloscwMagazynie;
        }
        public void setIloscwMagazynie(int IloscwMagazynie) {
            this.IloscwMagazynie = IloscwMagazynie;
        }
        }



