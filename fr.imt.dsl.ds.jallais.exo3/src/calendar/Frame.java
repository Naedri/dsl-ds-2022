package calendar;

import java.util.ArrayList;

public class Frame extends Container {
    private String title;
    private int length;
    private int width;

    public Frame() {
        super("frame");
    }

    public Frame(ArrayList<Section> sections) {
        super("frame", Section.parseToGuiComponent(sections));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSize(int w, int l) {
        this.width = w;
        this.length = l;
    }

}
