public class uczelnia {
    int id;
    String nazwa;
    String miejscowosc;
    String opis;

    public uczelnia(int id, String nazwa, String miejscowosc, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
        this.opis = opis;
    }

    public String getInfo(){
        return "Uczelnia numer  " + id  +  "nazwa uczelni  " + nazwa  +  "miejscowosc  "  + miejscowosc + "opis uczelni   "  + opis;
    }
}
