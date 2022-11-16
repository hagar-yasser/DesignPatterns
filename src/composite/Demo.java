package composite;

public class Demo {
    public static void main(String[] args) {
        Component cellPhone=new CellPhone();
        Component headSet=new HeadSet();
        Composite cellPhoneBox=new Box();
        cellPhoneBox.addChild(cellPhone);
        Composite headSetBox=new Box();
        headSetBox.addChild(headSet);
        Composite orderBox=new Box();
        orderBox.addChild(cellPhoneBox);
        orderBox.addChild(headSetBox);
        System.out.println("Total price is "+orderBox.getPrice());
    }
}
