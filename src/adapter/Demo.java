package adapter;

public class Demo {
    public static void main(String[] args) {
        TwoHeadPowerPlug egyptCharger=new EgyptCharger();
        egyptCharger.chargeUsingTwoHeadPlug();
        ThreeHeadPowerPlug usCharger=new USCharger();
        usCharger.chargeUsingThreeHeadPlug();
        ThreeToTwoPowerPlugAdapter threeToTwoPowerPlugAdapter=new ThreeToTwoPowerPlugAdapter(egyptCharger);
        threeToTwoPowerPlugAdapter.chargeUsingThreeHeadPlug();
    }
}
