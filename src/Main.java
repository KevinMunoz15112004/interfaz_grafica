import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        JFrame frame  = new JFrame("Aplicación para Cálculo de Figuras Geométricas");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setPreferredSize(new Dimension(480, 600));
        frame.pack();
        frame.setVisible(true);
    }
}