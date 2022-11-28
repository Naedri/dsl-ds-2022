package calendar;

import java.util.ArrayList;

public abstract class Container {

    private String refName;
    public String toString() {
        String result = this.refName + " {\n";
        for (GuiComponent e : this.getChildren())
            result += e.toString() + "\n";
        result += "}";
        return result;
    }

    private ArrayList<GuiComponent> children;

    public Container(String refName, ArrayList<GuiComponent> children) {
        this.children = children;
        this.refName = refName;
    }

    public String getRefName(){
        return this.refName;
    }

    public Container(String refName) {
        this.refName = refName;
        this.children = new ArrayList<GuiComponent>();
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
