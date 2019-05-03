import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello");
        ChooseCity cc = new ChooseCity();
        cc.setVisible(true);
        cc.setSize(new Dimension(400,200));
        cc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cc.setResizable(false);

    }
}
