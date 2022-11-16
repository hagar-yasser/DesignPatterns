package adapter;

public class EgyptCharger implements TwoHeadPowerPlug{
    @Override
    public void chargeUsingTwoHeadPlug() {
        System.out.println("I am charging using 2 head power plug");
    }
}
