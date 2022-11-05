package Singleton;

public class Main {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);
        System.out.println(singleton.getContador());
    }
}
