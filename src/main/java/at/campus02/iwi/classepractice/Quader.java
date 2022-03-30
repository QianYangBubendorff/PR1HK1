package at.campus02.iwi.classepractice;

public class Quader {
    public static void main(String[] args) {
        Quader q1= new Quader();
        q1.lange=3.5;
        q1.breite=2.5;
        q1.hoehe=2.0;
        System.out.println(q1.grundfleche());
        System.out.println(q1.volumen());
        System.out.println(q1.oberflaeche());
    }
    public double lange;
    public double breite;
    public double hoehe;

    public double grundfleche(){
        return lange*breite;
    }
    public void skaliere(double faktor){
        lange=lange*faktor;
        breite=breite*faktor;
        hoehe=hoehe*faktor;
    }
    public double volumen(){
        return lange*breite*hoehe;
    }
    public double oberflaeche(){
        return 2*(lange*breite+lange*hoehe+breite*hoehe);
    }
}
