package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Component{
    private List<Component> children;
    public Composite (){
        children=new ArrayList<>();
    }

    public List<Component> getChildren() {
        return children;
    }
    public void addChild(Component c){
        children.add(c);
    }
    public Component getChildAtIndex(int index){
        if(index<0||index>=children.size())
            return null;
        return children.get(index);
    }
    public void removeChildAtIndex(int index){
        if(index<0||index>=children.size())
            return;
        children.remove(index);
    }
}
