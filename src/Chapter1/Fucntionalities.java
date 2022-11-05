package Chapter1;

import java.util.ArrayList;
import java.util.function.Function;

public class Fucntionalities {

    private Function<String,String> toCapitalLetter = x ->x.toUpperCase();

    public void pruebas(){
        System.out.println(toCapitalLetter.apply("Victor"));
        Saluda(toCapitalLetter,"Victor");
    }


    public void Saluda( Function<String,String> myFunction,String nombre){
        myFunction.apply(nombre);
    }

}
