import javax.swing.*;

public class Main {
    static void framePanel() {
        JFrame object = new JFrame();
        object.setTitle("Brick Breaker");
        object.setSize(800,700);
        object.setLocationRelativeTo(null);
        object.setResizable(false);
        object.setVisible(true);
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        framePanel();
    }
}
