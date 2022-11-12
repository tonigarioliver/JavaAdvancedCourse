package Exercise12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args){
        System.out.println(highestValue(-1,2));
    }

    /**
     *
     * @param nums list of integers to fill in fucntion
     * @return highest values
     */
    public static int highestValue(int...nums){
        ArrayList<Integer> listInt = new ArrayList<>();
        for (int value:nums){
            listInt.add(value);
        }
        OptionalInt result  = listInt.stream().
                sorted(Comparator.reverseOrder()).
                mapToInt(x->x).findFirst();

        return result.getAsInt();
    }
}
