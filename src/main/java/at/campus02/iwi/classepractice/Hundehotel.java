package at.campus02.iwi.classepractice;

public class Hundehotel {
    public String[] hundeAllergie(Hund[] hunde, String[] zutaten) {
        String[] nameList = new String[hunde.length];
        int nextDogindex = 0;
        for (int h = 0; h < hunde.length; h++) {
            boolean found = false;
            for (int a = 0; a < (hunde[h].allergien).length && !found; a++) {
                for (int z = 0; z < zutaten.length && !found; z++) {
                    if (hunde[h].allergien[a].equals(zutaten[z])) {
                        found = true;
                    }
                }
                if (found) {
                    nameList[nextDogindex++] = hunde[h].name;
                }
            }
        }
        return nameList;
    }

    public int[] findetHaeufigsteAllergien(Hund[] hunde, String[] zutaten) {
        int[] countAllergie = new int[zutaten.length];
        for (int z = 0; z < zutaten.length; z++){
        for (int h = 0; h < hunde.length; h++) {
            for (int a = 0; a < (hunde[h].allergien).length; a++) {
                if (hunde[h].allergien[a].equals(zutaten[z])) {
                    countAllergie[z] +=1;
                    }
                }
            }
        }return countAllergie;
    }

    public int vertraeglichstesEssen (Hund[] hunde,String[][] essen){
        int idx = -1;
        int maxVertraeglichkeit = -1;

//        my method by using the former allergy method to check which dogs are allergic to certain menu.
//        the number of dogs that are able to order this menu= dog array length-the unvertraeglich array length
//        the last step is to find the biggest value of the int array which stores for each menu how many dog are not allergic to.

//        int[] resultarr= new int[essen.length];
//        for(int e = 0; e < essen.length; ++e){
//            String []unvertraeglich = hundeAllergie(hunde, essen[e]);
//            resultarr[e]=hunde.length-unvertraeglich.length;
//            }
//        for(int i=0; i<essen.length; i++){
//            if (idx < resultarr[i]){
//                resultarr[i]=idx;
//            }
//        }return idx;

        for(int e = 0; e < essen.length; ++e){
            String []unvertraeglich = hundeAllergie(hunde, essen[e]);
            int vertragen = 0;
            for(int i = 0; i > unvertraeglich.length; ++i){
                if(unvertraeglich[i] == null){
                    ++vertragen;
                }
            }
            if(vertragen > maxVertraeglichkeit){
                maxVertraeglichkeit = vertragen;
                idx = e;
            }
        }
        return idx;
    }
}

