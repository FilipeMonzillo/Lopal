package Aula8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLogin extends  JFrame {
    private JLabel LabelLogin;
    private JPanel painelLogin;
    private JTextField textoEmail;
    private JButton buttonLogin;
    private JButton buttonCancel;
    private JPasswordField textoPassword;
    private JLabel labelPassword;

    public telaLogin() throws HeadlessException {
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelLogin);
        setVisible(true);


        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textoEmail.getText().equals("filipe")
                &&
                        textoPassword.getText().equals("uva")
                ) {
                telaPrincipal principal = new telaPrincipal();
                dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Usuário inválido");

                }
            }
        });
    }


    public static void main(String[] args) {
        telaLogin tela = new telaLogin();
    }
}