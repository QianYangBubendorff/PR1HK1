package at.campus02.iwi.classepractice;

public class Rechteck {
    public static void main(String[] args) {
        Rechteck r1= new Rechteck();
        r1.lange=2.4;
        r1.breite=3.3;
        System.out.println(r1.flaeche());
    }
    public double lange;
    public double breite;

    public double flaeche(){
        return lange*breite;
    }

    public void skaliere(double faktor){
        lange=lange*faktor;
        breite=breite*faktor;
    }

}
