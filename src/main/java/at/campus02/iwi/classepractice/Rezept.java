package at.campus02.iwi.classepractice;

public class Rezept {
    public static void main(String[] args) {
        Rezept r1 = new Rezept();
        r1.zutatenName = new String[]{"nuts", "milk", "chocolate"};
        r1.zutaten = new double[][]{{200, 1.0}, {200, 1.0}, {200, 1.0}}
        System.out.println(r1.allergisch("nuts"));
    }

    public int anzahlPersonen;
    public String[] zutatenName;
    public double[][] zutaten;

    public boolean allergisch(String zutaten) {
        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].equals(zutaten)) {
                return true;
            }
        }
        return false;
    }

    public boolean laktoseFrei() {
        boolean isLaktoseFrei = true;
        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].equals("milch") || zutatenName[i].contains("kaese")) {
                isLaktoseFrei = false;
                zutaten[i][0] = 0.0;
                zutaten[i][1] = 0.0;
                return false;
            }

        }
        return true;
    }

    public double kostet() {
        double summe = 0;
        for (int z = 0; z < zutaten.length; ++z) {
            summe += zutaten[z][1];
        }
        return summe;
    }

    public double kostetProPerson() {
        return kostet() / anzahlPersonen;
    }

    public void aenderePersonen(int anzahl) {
        if (anzahl > 0) {
            double factor = (double) anzahl / anzahlPersonen;
            anzahl = anzahlPersonen;
            for (int z = 0; z < zutaten.length; ++z) {
                zutaten[z][0] *= factor;
                zutaten[z][1] *= factor;
            }
        }
    }
}
