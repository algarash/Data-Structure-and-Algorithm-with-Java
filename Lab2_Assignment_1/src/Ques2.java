import java.util.Arrays;

public class Ques2 {

    public static void main(String[] args) {
        int[]x={11,12,13,14,15};
        System.out.println(Arrays.toString(backup(x)));
    }
    public static int[] backup(int [] back_up){
        int [] arr2= new int[back_up.length];
        for (int i = 0; i < back_up.length ; i++) {
            back_up[i]=back_up[i];
        }
        return back_up;
    }
}
