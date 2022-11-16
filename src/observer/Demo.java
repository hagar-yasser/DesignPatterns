package observer;

public class Demo {
    public static void main(String[] args) {
        Observer o1=new Observer("Hagar");
        Observer o2=new Observer("Yasser");
        Observer o3=new Observer("AbdelRaouf");
        Observer o4=new Observer("Ali");
        WhatsappGroup g1=new WhatsappGroup("Group 1");
        WhatsappGroup g2 =new WhatsappGroup("Group 2");
        o1.addSubscription(g1);
        o2.addSubscription(g2);
        o3.addSubscription(g1);
        o4.addSubscription(g2);
        o1.sendMessageForSubscriberAtIndex("message From Hagar",0);
        o2.sendMessageForSubscriberAtIndex("message from yasser",0);

    }
}
