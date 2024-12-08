import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JTextField textField2;
    public JPanel mainPanel;
    private JLabel lblArea;
    private JButton trianguloEquilateroButton;
    private JButton cuadradoButton;
    private JButton trianguloIRectIsoscelesButton;
    private JButton RectantguloButton;
    private JButton CirculoButton;
    private JLabel lblPerimetro;

    public form1() {
        RectantguloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                lblArea.setText(String.valueOf(num1*num2));
                lblPerimetro.setText(String.valueOf(2*(num1+num2)));
            }
        });

        trianguloEquilateroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                lblArea.setText(String.valueOf(0.5*num1*num2));
                lblPerimetro.setText(String.valueOf(3*num1));
            }
        });

        CirculoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                lblArea.setText(String.format("%.2f",Math.PI*num1*num1));
                lblPerimetro.setText(String.format("%.2f",2*Math.PI*num1));
            }
        });

        cuadradoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                lblArea.setText(String.valueOf(num1*num1));
                lblPerimetro.setText(String.valueOf(4*num1));
            }
        });

        trianguloIRectIsoscelesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                lblArea.setText(String.valueOf(0.5*num1*num1));
                lblPerimetro.setText(String.format("%.2f",2*num1+(num1*Math.sqrt(2))));
            }
        });
    }




}
