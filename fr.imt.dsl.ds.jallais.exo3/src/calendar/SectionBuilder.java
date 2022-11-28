package calendar;

public class SectionBuilder {
	private FrameBuilder parent;
	private String name, location;
	private LocalDate date;
	private LocalTime startTime, endTime;

	public SectionBuilder(FrameBuilder parent) {
		this.parent = parent;
	}

	public void setName(String arg) {
		name = arg;
	}

	public SectionBuilder on(int year, int month, int day) {
		date = new LocalDate(year, month, day);
		return this;
	}

	public SectionBuilder from(String startTime) {
		this.startTime = LocalTime.parse(startTime);
		return this;
	}

	public SectionBuilder to(String endTime) {
		this.endTime = LocalTime.parse(endTime);
		return this;
	}

	public SectionBuilder at(String location) {
		this.location = location;
		return this;
	}

	public SectionBuilder section(String name) {
		return parent.section(name);
	}

	public Section getContent() {
		return new Section(name, location, date, startTime, endTime);
	}
}
