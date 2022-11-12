package State;

public class Telefono {
    public State state;

    public Telefono(){
        state = new BlockState(this);
    }

    public void nextState(State state){
        System.out.println("Initial State is " + this.state.getClass().getName());
        this.state = state;
        System.out.println("Estado final is"+ this.state.getClass().getName());
    }
    public State getState(){
        return state;
    }
}
