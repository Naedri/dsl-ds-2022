package calendar;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Output of ugly method:");
		System.out.println(buildCalendarUgly());
		System.out.println("\n");
		System.out.println("Output of beautiful method:");
		System.out.println(buildGUIBeautiful());

	}
	
	private static Frame buildCalendarUgly(){
		Frame frame = new Frame();
		Section event1 = new Section();
		event1.setName("DSL tutorial");
		event1.setDate(2009, 11, 8);
		event1.setStartTime("09:00");
		event1.setEndTime("16:00");
		event1.setLocation("Aarhus Music Hall");
		frame.addEvent(event1);
		Section event2 = new Section();
		event2.setName("Making use of Patterns");
		event2.setLocation("Aarhus Music Hall");
		event2.setStartTime("14:15");
		event2.setEndTime("15:45");
		event2.setDate(2009, 10, 5);
		frame.addEvent(event1);
		return frame;
	}
	
	private static Frame buildGUIBeautiful(){
		
		FrameBuilder frameBuilder = new FrameBuilder();

		frameBuilder
			.section("Frame A")
				.on(2009, 11, 8)
				.from("09:00")
				.to("16:00")
				.at("Aarhus Music Hall")
			.section("Making use of Patterns")
				.on(2009, 10, 5)
				.from("14:15")
				.to("15:45")
				.at("Aarhus Music Hall");

		Frame frame = frameBuilder.getContent();
		
		return frame;
	}
}
