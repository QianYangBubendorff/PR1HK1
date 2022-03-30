package at.campus02.iwi.classepractice;

public class Rezept {
    public static void main(String[] args) {
    Rezept r1= new Rezept();
    r1.zutatenName="nuts";
        System.out.println(r1.allergisch("nuts"));
    }
    public int anzahlPersonen;
    public String[] zutatenName;
    public double[] zutaten;
    public boolean allergisch(String zutaten){
        for(int i=0; i<zutatenName.length;i++){
        if(zutaten==){
            return true;
        }else return false;
    }
    public boolean laktoseFrei(){
        if(zutatenName=="Milch"){
            zutaten={0,0};
        }
    }
}
