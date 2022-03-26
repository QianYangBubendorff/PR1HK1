package at.campus02.iwi.recursion;

public class BinaryCountOne {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 1, 1};
        System.out.println(countOne(arr, 0, arr.length - 1));
    }

    public static int countOne(int[] array, int left, int right) {
        int count=0;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == 0) {
                if (array[middle + 1] == 1) {
                    count = middle;
                }else countOne(array, left + 1, right);
            }

                }return count;
            }
//                else if (array[middle] == 1) {
//                    if (array[middle - 1] == 0) {
//                        count= (middle + 1);
//                    } else {
////                        left = middle - 1;
//                        countOne(array, left, right-1);
//                    }
//                }
            }





