package bridge;

public class Demo {
    public static void main(String[] args) {
        Flavor cheese=new CheeseFlavor();
        Flavor salt = new SaltFlavor();
        Snack cheeseChips=new Chips(cheese);
        Snack saltChips=new Chips(salt);
        Snack cheeseBakedBites=new BakedBites(cheese);
        Snack saltBakedBites=new BakedBites(salt);
        cheeseChips.describeSnackTaste();
        saltChips.describeSnackTaste();
        cheeseBakedBites.describeSnackTaste();
        saltBakedBites.describeSnackTaste();
    }
}
