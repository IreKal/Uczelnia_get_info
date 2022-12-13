public class UJK extends uczelnia {
    String Dziekan;

    public UJK(int id, String nazwa, String miejscowosc, String opis, String dziekan) {
        super(id, nazwa, miejscowosc, opis);
        Dziekan = dziekan;
    }

    public String getInfo() {
    return "Uczelnia numer " + id + "\nnazwa uczelnin " + nazwa +  "\nmiejscowosc  " +
            miejscowosc +  "\nopis uczelni " + opis +  "\nnazwisko dziekana  " + Dziekan ;
    }
}




