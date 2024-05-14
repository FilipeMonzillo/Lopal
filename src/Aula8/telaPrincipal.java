package Aula8;

import javax.swing.*;
import java.awt.*;

public class telaPrincipal extends  JFrame {
    private JPanel panel1;
    private JLabel labelTexto;


    public telaPrincipal() throws HeadlessException {
        setSize(900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(labelTexto);
        setVisible(true);
    }
}
