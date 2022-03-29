package at.campus02.iwi.bonus;

public class Gehaltdemo {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1=new Mitarbeiter();
        mitarbeiter1.gehalt=28000;
        System.out.println(mitarbeiter1.monatsAbrechnung());
    }
}
