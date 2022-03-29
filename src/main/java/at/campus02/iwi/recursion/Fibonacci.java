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

    }
