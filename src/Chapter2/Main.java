package Chapter2;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorialiteator(5));
        System.out.println(factorialrecursive(5));
        System.out.println(factorialfucntional(5));
    }

    public static int factorialiteator(int number){
        int factorial = 1;
        for(int i = 1; i <=number; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static int factorialrecursive(int number){
        if(number == 0){
            return 1;
        }
        return number * factorialrecursive(number -1);
    }

    public static int factorialfucntional(int number){
        return IntStream.rangeClosed(1,number).
                reduce(1,(x,y)->x*y);
    }
}
