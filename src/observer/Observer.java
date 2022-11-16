package observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<WhatsappGroup>subscriptions;
    private String name;
    public Observer(String n){
        name=n;
        subscriptions=new ArrayList<>();
    }
    public List<WhatsappGroup> getSubscriptions() {
        return subscriptions;
    }

    public void addSubscription(WhatsappGroup w){
        if(w==null)
            return;
        w.addObserver(this);
        subscriptions.add(w);
    }
    public WhatsappGroup getObserverAtIndex(int index){
        if(index<0||index>=subscriptions.size())
            return null;
        return subscriptions.get(index);
    }
    public void removeObserverAtIndex(int index){
        if(index<0||index>=subscriptions.size())
            return;
        subscriptions.remove(index);
    }
    public void sendMessageForSubscriberAtIndex(String message,int index){
        if(index<0||index>=subscriptions.size())
            return;
        subscriptions.get(index).notifyObservers(message);
    }
    public void update(String message){
        System.out.println("I am observer "+name);
        System.out.println("I got an update message: "+message);
    }
}
