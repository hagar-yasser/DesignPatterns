package bridge;

public class BakedBites extends Snack{

    public BakedBites(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void describeSnackTaste() {
        System.out.print("I have a taste of baked bites and ");
        flavor.describeFlavorTaste();
    }
}
