package Aula8;

import javax.swing.*;
import java.awt.*;

public class test extends JFrame {

        // apertar "alt" + "insert"
        // apertar "enter" algumas vezes

    public test() throws HeadlessException {

        // Configurando o tamanho da telinha
        setSize(900,600);

        // Configurar o que acontece quando eu fechar a telinha
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Adicionar componentes na tela
        Container c = getContentPane();

        c.setLayout(null);

        JLabel titulo = new JLabel("Meu primeiro programa Gráfico!");
        titulo.setFont(new Font("Arial",Font.PLAIN,20));
        titulo.setSize(200,20);
        titulo.setLocation(200,50);
        c.add(titulo);


        // tornar a tela visivel
        setVisible(true);
    }

    public static void main(String[] args) {
        test t = new test();

    }
}
