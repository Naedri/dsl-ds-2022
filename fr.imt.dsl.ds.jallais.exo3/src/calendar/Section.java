package calendar;

public class Section extends Container implements GuiComponent {

    private String name;

    public Section() {
        this(null );
    }

    public Section(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "  section " + name + " {\n" +
                "  }";
    }

}
