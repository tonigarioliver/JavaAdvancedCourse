package Observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void receive() {
        System.out.println("Signal received radio");
    }
}
