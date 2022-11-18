package Exercise13;

import java.util.Arrays;

public class ArrayBuilder {
    public static int[] addtoArray(int[] array, int position,int value){
        try {
            array[position] = value;
            return array;
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index ourt of boundaries");
            int[] newArray = Arrays.copyOf(array,position+1);
            newArray[position]=value;
            return newArray;
        }
    }
}
