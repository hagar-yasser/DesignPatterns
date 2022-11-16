package observer;

import java.util.ArrayList;
import java.util.List;

public class WhatsappGroup {
    private String name;
    private List<Observer>observers;

    public WhatsappGroup(String name) {
        this.name = name;
        observers=new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void addObserver(Observer o){
        observers.add(o);
    }
    public Observer getObserverAtIndex(int index){
        if(index<0||index>=observers.size())
            return null;
        return observers.get(index);
    }
    public void removeObserverAtIndex(int index){
        if(index<0||index>=observers.size())
            return;
        observers.remove(index);
    }
    public void notifyObservers(String message){
        for (Observer o:observers) {
            o.update(message);
        }
    }
}
