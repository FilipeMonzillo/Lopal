package Aula8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class telaNovoLogin extends JFrame{
    private JTextField textNovoLogin;
    private JLabel LabelNovoLogin;
    private JTextField textNovaSenha;
    private JButton criarButton;
    private JPanel PanelNovoLogin;



    public telaNovoLogin() throws HeadlessException {
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(PanelNovoLogin);
        setVisible(true);


        criarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    try {
                        FileWriter escritor = new FileWriter("logins.txt", true);
                        escritor.write(textNovoLogin.getText() + ";" + textNovaSenha.getText() + "\n");
                        escritor.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    telaLogin Login = new telaLogin();
                    dispose();
                }
            }
        });
    }

    }
