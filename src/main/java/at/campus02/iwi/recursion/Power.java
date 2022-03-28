package at.campus02.iwi.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(powerSimple(2,4));
        System.out.println(powerSimple1(2,1));
    }

    public static int powerSimple(int x, int n){
        int potenz=1;
        if(n>0){
            potenz=x*powerSimple(x,n-1);

        }return potenz;
    }

    public static int powerSimple1(int x, int n){
        int potenz=0;
        if(n>0&&n%2==0){
            potenz=powerSimple(x,n/2)*powerSimple(x,n/2);
        }else if(n>0&&n%2!=0){
            potenz=x*powerSimple(x,n/2)*powerSimple(x,n/2);
        } return potenz;
    }
}
