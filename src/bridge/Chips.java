package bridge;

public class Chips extends Snack{

    public Chips(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void describeSnackTaste() {
        System.out.print("I have a taste of chips and ");
        flavor.describeFlavorTaste();
    }
}
