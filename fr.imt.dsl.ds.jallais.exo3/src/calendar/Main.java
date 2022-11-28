package calendar;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Output of beautiful method:");
		System.out.println(buildGUIBeautiful());

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
