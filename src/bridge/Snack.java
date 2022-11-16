package bridge;

public abstract class Snack {
    public Flavor flavor;
    public Snack(Flavor flavor){
        this.flavor=flavor;
    }
    abstract void describeSnackTaste();
}
