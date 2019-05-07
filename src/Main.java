import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      //  System.out.println("Hello");
        ChooseCity cc = new ChooseCity();
        cc.setVisible(true);
        cc.setSize(new Dimension(500,150));
        cc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cc.setResizable(false);

    }
}
