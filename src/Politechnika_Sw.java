public class Politechnika_Sw extends  uczelnia {
    String kierunki;

    public Politechnika_Sw(int id, String nazwa, String miejscowosc, String opis, String kierunki) {
        super(id, nazwa, miejscowosc, opis);
        this.kierunki = kierunki;
    }

    public String getInfo() {
       return  "Uczelnia numer  " + id + "\nuczelnia nazywa sie  " + nazwa + "\nmiejscowosc  " + miejscowosc + "\nopis uczelni  " + opis +
               "\nkierunki na uczelni  " + kierunki;
    }

}



