package at.campus02.iwi.Strafe;

public class Strafedemo {
    public static void main(String[] args) {
        Strafe strafe1= new Strafe();
        strafe1.anzahl=0;
        strafe1.strafe(25);
//        strafe1.verbandspaket();
        strafe1.alkohl(1.5);
        strafe1.sonstiges(20.0);
        System.out.println(strafe1.getStrafe());
    }
}
