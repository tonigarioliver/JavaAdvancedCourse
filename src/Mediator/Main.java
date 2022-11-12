package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediatorConcreto();
        Colega colega1 = new ColegaConcreto1();
        Colega colega2 = new ColegaConcreto2();

        mediator.register(colega1);
        mediator.register(colega2);
        colega1.envia();
    }
}
