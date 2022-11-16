package adapter;

public class ThreeToTwoPowerPlugAdapter implements ThreeHeadPowerPlug{
    private TwoHeadPowerPlug twoHeadPowerPlug;
    public ThreeToTwoPowerPlugAdapter(TwoHeadPowerPlug t){
        twoHeadPowerPlug=t;
    }

    @Override
    public void chargeUsingThreeHeadPlug() {
        twoHeadPowerPlug.chargeUsingTwoHeadPlug();
    }
}
