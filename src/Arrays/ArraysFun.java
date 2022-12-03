package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysFun {
    public static void main(String[] args) {
        int[] in={1,3,8,6,5,9,10};
        int[] in2={1,3,10,5,8,9};

        System.out.println(Arrays.equals(in,in2)); //false

//        Arrays.sort(in);
//        for(int i=0; i<in.length; i++){
//            System.out.println(in[i]);
//        }

//        Arrays.parallelSort(in2);
//        for(int i=0; i<in.length; i++){
//            System.out.println(in2[i]);
//        }

        int[] in3=Arrays.copyOf(in,8);
        for(int i=0; i<in3.length; i++){
            System.out.println(in3[i]);
        }

        int[] in4=Arrays.copyOfRange(in,1,3);
        for(int i=0; i<in4.length; i++){
            System.out.println(in4[i]);
        }

        List al=Arrays.asList(in);

        for (int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
