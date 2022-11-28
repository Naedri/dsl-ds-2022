package calendar;

import java.util.ArrayList;

public class Frame {
	private ArrayList<Section> sections;
	
	public Frame() {
		sections = new ArrayList<Section>();
	}
	
	public ArrayList<Section> getEvents() {
		return sections;
	}

	public void setEvents(ArrayList<Section> sections) {
		this.sections = sections;
	}

	public void addEvent(Section e){
		sections.add(e);
	}
	
	public String toString(){
		String result = "calendar {\n";
		for (Section e:sections) 
			result += e.toString()+"\n";
		result += "}";
		return result;
	}
}
