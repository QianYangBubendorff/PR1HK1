package at.campus02.iwi.recursion;

public class SumOfNumberList {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum = sum + i;
            }
            System.out.println(sum);

//        method with recursion:
            System.out.println(sumNumber(0, 100));
        }

        public static int sumNumber(int startNumber, int endNumber) {
            if (endNumber > startNumber) {
                return endNumber + sumNumber(startNumber, endNumber - 1);
            } else return 0;

        }
    }


