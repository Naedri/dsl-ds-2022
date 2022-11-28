package calendar;

public class Button implements GuiComponent {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString(){
        return "button: " + text;
    }
}
