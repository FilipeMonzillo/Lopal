package Aula8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class jogosUsuarios extends JFrame {
    private JPanel jogosUsuarios;
    private JTable tabelaJogos;
    private JButton botaoDeCriarJogoUser;
    private JButton voltarButton;

    public jogosUsuarios() {
        setSize(900, 600);
        setContentPane(jogosUsuarios);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        DefaultTableModel dlmodel = (DefaultTableModel) tabelaJogos.getModel();
        dlmodel.addColumn("SEUS JOGOS!");
        DefaultTableModel tblModel = (DefaultTableModel) tabelaJogos.getModel();
        dlmodel.addColumn("SEUS JOGOS!");

        voltarButton.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {
                new telaPrincipal();
                dispose();
            }
        });
        botaoDeCriarJogoUser.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {
                String[] salvarJogosUser = new String[6];
                salvarJogosUser = new String[]{Arrays.toString(JogoMega.geradorMegasena())};
                try {
                    FileWriter escritor = new FileWriter("JogoMega.txt", true);
                    escritor.write(Arrays.toString(salvarJogosUser) + "\n");
                    escritor.close();
                } catch (IOException p) {
                    throw new RuntimeException(p);
                }
                tblModel.addRow(salvarJogosUser);
            }
        });
        try {
            BufferedReader leitor =
                    new BufferedReader(new FileReader("jogosUsuario.txt"));
            String linha = leitor.readLine();
            do {
                if (linha != null) ;

                {
                    tblModel.addRow(new String[]{linha});
                }
            } while (linha != null);
            leitor.close();
        } catch (Exception e) {
        }
    }
}