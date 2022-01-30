import java.util.Arrays;
public class mastery {
    public static void main(String[] args) {
        int[]x={11,12,13,14,15};
       System.out.println(Arrays.toString(x));
       System.out.println("after reverse");
       System.out.println(Arrays.toString(reverse(x)));
       System.out.println("after shift right");
       System.out.println(Arrays.toString(shiftRight(x)));
       System.out.println("after arr2 reverse");
        System.out.println(Arrays.toString(reverArray(x)));
    }
    public  static int[] shiftRight(int[] a)
    {
        int t=a[a.length-1];

        for (int i = a.length-1; i >0 ; i--) {
            a[i]=a[i-1];
        }
        a[0]=t;
        return a;
    }
    public  static int[] shiftLeft(int[] a)
    {
        int t=a[0];

        for (int i = 0; i <a.length-1 ; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=t;
        return a;
    }
    public  static int[] reverse(int[] a)
    {
        int t;
        int n= a.length-1; //n= 4
                       //i< 2
        for (int i = 0; i <a.length/2 ; i++) {
            t=a[i]; // 1- t=11 , 12, 13 , 14,15
            a[i]=a[n]; // a[0]=15
            a[n]=t;  // a[4] = 11
            n--; // n=3

        }
        return a;
    }
    public static int[] reverArray(int [] d){
        int n= d.length-1;
        int [] arr2= new int[d.length];
        for (int i =0; i<d.length; i++) {
            arr2[i]=d[n];
            n--;
        }
        for (int i = 0; i < d.length ; i++) {
            d[i]=arr2[i];
        }
        return d;
    }
}
