package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static int counter = 0;

    private static ArrayList<String> listArray=new ArrayList<>();
    static public void main(String[] args){
        Fucntionalities functions = new Fucntionalities();
        System.out.println("Result is: " +  Integer.toString(sum(2,3)) );
        listArray.add("Pepe");
        listArray.add("Juan");
        listArray.add("Manu");
        listArray.stream().forEach(x->System.out.println(x));
        Stream<String> nombres = listArray.stream().map(x->x.toUpperCase()).
                filter((x)->x.startsWith("P"));
        nombres.forEach(x->System.out.println(x));
        int[] arraynumbers = {1,2,3,4,5};
        IntStream streamnumbers = Arrays.stream(arraynumbers);
        int result = streamnumbers.filter((x)-> x %2 ==0)
                .reduce(0,(x,y)->{
                    System.out.println("La x es: "+x+"y la Y es: "+y);
                    return x + y;
                });
        System.out.println(result);


    }

    public static String toMayuscula(String name){
        return name.toUpperCase();
    }
    public static int sum(int a, int b){
        counter +=1;//impure
        multiplication(a,b);// colateral
        return a + b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
}
