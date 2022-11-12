package Observer;

public class ReceptorSatelite implements Receptor{
    @Override
    public void receive() {
        System.out.println("Signal received satelite");
    }
}
