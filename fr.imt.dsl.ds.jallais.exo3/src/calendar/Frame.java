package calendar;

import java.util.ArrayList;

public class Frame extends Container {
    private String title;
    private int length;
    private int width;

    public Frame() {
        super();
    }

    public Frame(ArrayList<Section> sections) {
        super(sections);
    }

    public String toString() {
        String result = "calendar {\n";
        for (Section e : super.getSections())
            result += e.toString() + "\n";
        result += "}";
        return result;
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
