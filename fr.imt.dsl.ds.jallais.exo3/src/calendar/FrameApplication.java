package calendar;

import javax.swing.*;

public class FrameApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                FrameBuilder frameBuilder = new FrameBuilder();
                frameBuilder.section("Frame A");
                Frame frame = frameBuilder.getContent();

                Frame A = new Frame();
                //A.setLayout(new FlowLayout());
                //A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                A.setTitle("Frame A");
                A.setSize(200, 100);

                Section content = new Section();
                Section body = new Section();
                Section header = new Section();

                Label label0 = new Label();
                label0.setText("Hello");

                Button button1 = new Button();
                button1.setText("World!");

                A.addChild(content);
                A.addChild(body);
                A.addChild(header);

                header.addChild(label0);
                body.addChild(button1);

                System.out.println(frame.toString());

                //Frame frame = frameBuilder.getContent();
                //return frame;
            }
        });
    }
}
