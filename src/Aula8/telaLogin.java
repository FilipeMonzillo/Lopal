package Aula8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

public class telaLogin extends  JFrame {
    private JLabel LabelLogin;
    private JPanel painelLogin;
    private JTextField textoEmail;
    private JTextField textField1;
    private JButton buttonLogin;
    private JButton buttonCancel;
    private JPasswordField textoPassword;
    private JLabel labelPassword;
    private JButton novoLoginButton;

    public telaLogin() throws HeadlessException {
        setSize(600, 450);
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
                try {
                    boolean UsuValido = false;
                    BufferedReader leitor =
                            new BufferedReader(new FileReader("logins.txt"));
                    String linha = "";
                    do {
                        linha = leitor.readLine();
                        if (linha != null)
                        {
                            String[] login = linha.split(";");
                            if (login[0].equals(textoEmail.getText()) && login[1].equals(textField1.getText())) {
                                UsuValido = true;
                            }
                        }
                    } while (linha != null);
                    if (UsuValido)
                    {
                        telaPrincipal principal = new telaPrincipal();
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Usuário inválido");
                    }
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Não foi possivel carregar os usuários");
                }
            }
        });
        novoLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    telaNovoLogin novoLogin = new telaNovoLogin();
                    dispose();
                }
            }
        });
    }
    public static void main(String[] args) {
        telaLogin tela = new telaLogin();
    }
}