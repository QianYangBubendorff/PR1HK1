package at.campus02.iwi.classepractice;

import java.util.Arrays;

public class Grundsteuer {
    public static void main(String[] args) {
        Grundsteuer grundsteuer1 = new Grundsteuer();
        int[][] sQList= new int[][]{{1, 3, 4}, {1, 3, 3}, {3, 3, 5}, {4, 3, 5}, {5, 3, 5}, {4, 3, 4}, {2, 3, 3}, {3, 3, 5}, {3, 3, 5}, {5, 3, 5}};
        double[] steuerList= new double[]{3.20, 2.10, 0.90, 1.20, 2.30};
        int[] kundenList=new int[]{4,0,3,4,1,2,5};
        int[][] sQList1= new int[][]{{1, 3, 4}, {1, 3, 3}, {3, 3, 5}, {2, 3, 5}, {1, 3, 5}, {3, 3, 4}, {2, 3, 3}};
        double[] steuerList1= new double[]{3.20, 2.10, 0.90};
        System.out.println(Arrays.toString(grundsteuer1.grundsteuerBerechnen2(sQList, steuerList)));
        System.out.println(Arrays.deepToString(grundsteuer1.grundsteuerBerechnen(sQList, steuerList)));
        System.out.println(Arrays.deepToString(grundsteuer1.grundsteuerZuordnen(sQList1,kundenList,steuerList1)));
    }

    public double[][] grundsteuerBerechnen(int[][] array, double[] steuerList) {
        double[][] resultArr = new double[steuerList.length][2];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k = array[i][0] - 1;
            resultArr[k][0] = k + 1;
            resultArr[k][1] = resultArr[k][1] + steuerList[(array[i][0] - 1)] * array[i][1] * array[i][2];
        }
        return resultArr;
    }

    public double[] grundsteuerBerechnen2(int[][] array, double[] steuerList) {
        double[] resultArr = new double[steuerList.length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k = array[i][0] - 1;
            resultArr[k] = resultArr[k] + steuerList[(array[i][0] - 1)] * array[i][1] * array[i][2];
        }
        return resultArr;
    }

    public double[][] grundsteuerZuordnen(int[][] array, int[] kundenList, double[] steuerList){
        double[][] resultArr = new double[kundenList.length][2];
        int k=0;
        for(int i=0; i<kundenList.length; i++) {
                k=kundenList[i];
                resultArr[k][0]=k;
                resultArr[k][1]=resultArr[k][1] + steuerList[(array[i][0] - 1)] * array[i][1] * array[i][2];
            }return resultArr;
        }


    }

