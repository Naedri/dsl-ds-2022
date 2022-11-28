package calendar;

import java.util.ArrayList;

public class Section extends Container implements GuiComponent {
    public static ArrayList<GuiComponent> parseToGuiComponent(ArrayList<Section> sections) {
        ArrayList<GuiComponent> result = new ArrayList<>();
        for (Section section : sections) {
            result.add(section);
        }
        return result;
    }

    private String name;

    public Section() {
        super("section");
    }

    public Section(String name) {
        super("section");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
