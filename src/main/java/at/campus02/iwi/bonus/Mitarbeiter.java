package at.campus02.iwi.bonus;

public class Mitarbeiter {
    String vorname;
    String nachname;
    double gehalt;
    int alter;


    public double monatsAbrechnung(){
        double gehaltNachSv=0.0;
        gehaltNachSv=gehalt*0.8;
        double steuer=0.0;
        double nettoMonatGehalt=0.0;
        if(gehaltNachSv<=10000){
            steuer=gehaltNachSv*0.1;
        }if(gehaltNachSv<=20000&&gehaltNachSv>10000){
            steuer=10000*0.1+(gehaltNachSv-10000)*0.2;
        }if(gehaltNachSv<=30000&&gehaltNachSv>20000){
            steuer=10000*0.1+10000*0.2+(gehaltNachSv-20000)*0.32;
        }if(gehaltNachSv<=50000&&gehaltNachSv>30000){
            steuer=10000*0.1+10000*0.2+10000*0.32+(gehaltNachSv-30000)*0.45;
        }if(gehaltNachSv>50000){
            steuer=10000*0.1+10000*0.2+10000*0.32+20000*0.45+(gehaltNachSv-50000)*0.60;
        }
        nettoMonatGehalt=(gehaltNachSv-steuer)/12;
        return nettoMonatGehalt;
    }
}
