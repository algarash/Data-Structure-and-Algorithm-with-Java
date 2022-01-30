
public class SearchMethod {


    public static int sequSearch(int [] array, int elemnt){
        for (int i = 0; i < array.length; i++) {
            if (elemnt==array[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int [] array,int element){
        int start = 0;
        int end = array.length;
        int med = (start + end)/2;
        for (int i = start; i < end; i++){
            if (element == array[i]){
                return i;
            }
            else if (element > array[i]){
                start = med + 1;
            }
            else if (element < array[i]){
                end = med - 1;
            }
            med = (start + end)*2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array1 = {1,2,8,6,3,4};
        System.out.println("Using sequSearch: "+sequSearch(array1,8));
        System.out.println("Using Binary Shearch: "+binarySearch(array1,8));
    }
}
