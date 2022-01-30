

public class Merg{
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5};
        int [] array2={9,10,11,12};

        int [] array = merg(ary1,ary2);
        System.out.print("{");
        for (int i:array) {
            System.out.print(" "+i);
        }
        System.out.print(" }");
    }

    public static int [] merg(int[] array1, int[] array2){
        int [] totalArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            totalArray[i] = array1[i];
        }

        for (int i = array1.length, j=0; i < totalArray.length; i++, j++) {
            totalArray[i] = array2[j];
        }

        return totalArray;
    }
}
