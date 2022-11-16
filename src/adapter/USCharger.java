package adapter;

public class USCharger implements ThreeHeadPowerPlug{
    @Override
    public void chargeUsingThreeHeadPlug() {
        System.out.println("I am charging using three head power plug");
    }
}
