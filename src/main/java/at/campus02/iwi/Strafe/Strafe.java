package at.campus02.iwi.Strafe;

public class Strafe {
    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahl;

//    Erhöht das Attribut strafe aufgrund einer Geschwindigkeitsüberschreitung. Erhöhen Sie die Anzahl
//der Vergehen.
    public void strafe(int geschwindigkeitsueberschreitung){
        if(geschwindigkeitsueberschreitung<=20 &&geschwindigkeitsueberschreitung>0){
            strafe=30;
        }if(geschwindigkeitsueberschreitung<=30 &&geschwindigkeitsueberschreitung>20){
            strafe=50;
        }if(geschwindigkeitsueberschreitung<=50 &&geschwindigkeitsueberschreitung>30){
            strafe=100;
        }if(geschwindigkeitsueberschreitung<=100 &&geschwindigkeitsueberschreitung>50){
            strafe=500;
        }if(geschwindigkeitsueberschreitung>100){
            strafe=1500;
        }

    }

    public void verbandspaket(){
            strafe=strafe+25;
            anzahl=anzahl+1;
        }

    public void alkohl(double wert){
        if(wert>=0.5 && wert<=1.0){
            anzahl=anzahl+2;
            strafe=strafe+100;
        } if(wert>1.0 && wert<=2.0){
            anzahl=anzahl+2;
            strafe=strafe+400;
        } if(wert>2.0 && wert<=3.0){
            anzahl=anzahl+2;
            strafe=strafe+1000;
        } if(wert>3.0){
            anzahl=anzahl+2;
            strafe=strafe+5000;
        }
    }

    public void sonstiges(double wert){
        strafe=strafe+wert;
        anzahl=anzahl+1;
    }

    public double getStrafe(){
        if(anzahl==1){
            strafe=strafe*0.7;
        } if(anzahl==2){
            strafe=strafe*0.8;
        } if(anzahl==3){
            strafe=strafe*0.9;
        } if(anzahl>3){
            strafe=strafe*1;
        }
        return strafe;
    }
}
