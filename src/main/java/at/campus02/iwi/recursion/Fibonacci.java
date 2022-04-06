package at.campus02.iwi.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

        public static int fibonacci(int n){
        int fibonacciNumber=0;
            if(n<=2){
                fibonacciNumber=n-1;
            }
            else if(n>2){
                fibonacciNumber=fibonacci(n-1)+fibonacci(n-2);
               }
            return fibonacciNumber;
        }

////    public static void main(String[] args) {
//        // write your code here
//        // Aufgabe: Fibonacci-Zahlen berechnen
//        // -> 0 1 1 2 3 5 8 13 21 34 55
//
//
//        int ersteFib = 0;
//        int zweiteFib = 1;
//
//        System.out.println(ersteFib);
//        System.out.println(zweiteFib);
//
//        // In einer rekursiven Methode
//        fibonacciRekursiv(ersteFib, zweiteFib);
//
//
//    }
//    // brechen bei 1000 ab damit wir nicht unendlich weiter laufen
//    public static void fibonacciRekursiv(int a, int b) {
//        // Wir berechnen das Ergebnis aus a und b
//        int ergebnis = a + b;
//        // Wir überprüfen ob das Ergebnis bereits
//        // das Limit überschreitet
//        if (ergebnis > 1000) {
//            return;
//        } else {
//            // Sonst geben wir das Ergebnis in der Konsole aus
//            System.out.println(ergebnis);
//            // und rufen dann die Methode wieder auf, <- REKURSION!
//            // nur hat a nun den Wert von b
//            // und b bekommt den Wert von ergebnis
//            a = b;
//            b = ergebnis;
//            fibonacciRekursiv(a, b);
//        }
//    }


}

