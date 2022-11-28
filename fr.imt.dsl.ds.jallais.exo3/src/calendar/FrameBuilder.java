package calendar;

import java.util.ArrayList;
import java.util.List;

public class FrameBuilder {
    private List<SectionBuilder> sections = new ArrayList<SectionBuilder>();

    public SectionBuilder section(String name) {
        SectionBuilder child = new SectionBuilder(this);
        sections.add(child);
        //child.setName(name);
        return child;
    }

    public Frame getContent() {
        Frame result = new Frame();
        for (SectionBuilder e : sections)
            result.addChild(e.getContent());
        return result;
    }
}
