import javax.swing.*;
import java.awt.*;

public class ChooseCity extends JFrame {
    private JPanel mainPanel;

    private JButton buttonOk;
    private JButton buttonNext;
    private JComboBox comboBox1;
    private JLabel cityLabel;
    String  cityLabelString = "Enter or choose  your city name : ";


    public ChooseCity ()
    {
        add(mainPanel);
        setTitle("Step 1  ");
        setSize(new Dimension(400,200));
        cityLabel.setText(cityLabelString);
        buttonOk.setText("Okey");
        buttonNext.setText("Next step");

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
