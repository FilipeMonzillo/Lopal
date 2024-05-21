package Aula8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaPrincipal extends  JFrame {
    private JPanel Principal;
    private JLabel labelTexto;
    private JButton jogoDaMegaSenaButton;
    private JButton meusJogosButton;


    public telaPrincipal() throws HeadlessException {
        setSize(600,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(Principal);
        setVisible(true);

        meusJogosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new jogosUsuarios();
                dispose();

            }
        });

        jogoDaMegaSenaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new JogoMega();
                dispose();

            }
        });
    }


}
