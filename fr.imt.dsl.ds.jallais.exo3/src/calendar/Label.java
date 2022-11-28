package calendar;

public class Label implements GuiComponent {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString(){
        return "label: " + text;
    }
}
