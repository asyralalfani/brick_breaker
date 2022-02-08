import javax.swing.*;

public class Main {
    static void framePanel() {
        JFrame frame = new JFrame();
        Rules rules = new Rules();

        frame.setTitle("Brick Breaker");
        frame.setSize(800,700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rules);
    }
    public static void main(String[] args) {
        framePanel();
    }
}
