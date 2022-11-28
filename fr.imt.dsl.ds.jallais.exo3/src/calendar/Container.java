package calendar;

import java.util.ArrayList;

public abstract class Container {

    private ArrayList<GuiComponent> children;

    public Container(ArrayList<GuiComponent> children) {
        this.children = children;
    }

    public Container() {
        this.children =new ArrayList<GuiComponent>();
    }
    public ArrayList<GuiComponent> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<GuiComponent> children) {
        this.children = children;
    }

    public void addChild(GuiComponent e) {
        children.add(e);
    }

}
