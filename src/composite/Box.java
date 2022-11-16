package composite;

public class Box extends Composite{
    public Box(){
        super();
    }
    @Override
    public double getPrice() {
        double baseBoxPrice=1.5;
        double totalPrice=baseBoxPrice;
        for (Component c:getChildren()) {
            totalPrice+=c.getPrice();
        }
        return totalPrice;

    }
}
