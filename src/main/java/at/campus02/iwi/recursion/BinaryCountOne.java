package at.campus02.iwi.recursion;

public class BinaryCountOne {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 1, 1,1};
        System.out.println(countOne(arr, 0, arr.length - 1));
    }

    public static int countOne(int[] array, int left, int right) {
        int count = 0;
        if (array == null || array.length == 0) {
            return 0;
        }

        if (array[right] == 0) {
            return 0;
        }

        // if the first array element is 1, all its elements
        if (array[left] == 1) {
            return (right - left + 1);
        }

        // divide the array into left and right sub array and recur
        int mid = (left + right) / 2;
        return countOne(array, left, mid) + countOne(array, mid + 1, right);
    }
}






