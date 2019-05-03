import javax.swing.*;
import java.awt.*;

public class ChooseCity extends JFrame {
    private JPanel mainPanel;
    private JComboBox choosingCity;
    private JButton buttonOk;
    private JButton buttonNext;

    public ChooseCity ()
    {
        add(mainPanel);
        setTitle("Выберите город: ");
        setSize(new Dimension(400,200));
        //add(buttonOk);
      //  add(buttonNext);
        buttonOk.setText("Okey");
        buttonNext.setText("Next step");

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
