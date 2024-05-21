package Aula8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class JogoMega extends JFrame{
    private JPanel PainelSorteio;
    private JButton voltarButton;
    private JButton verButton;
    private JLabel JLabel5;
    private JLabel ResultMega;
    public static int[] geradorMegasena(){

        Random r = new Random();

        int desposableNum = 0;

        int[] megasenaAleatoria = new int[6];

        for(int i = 0; i <= 5; i++){
         desposableNum = r.nextInt( 160);

            boolean contains;

            if (Arrays.asList(megasenaAleatoria).contains (desposableNum)) contains = true;

            else contains = false;

            if(contains){

                i--;

            } else{

                megasenaAleatoria[i] = desposableNum;

            }

        }
        return megasenaAleatoria;
    }
    public JogoMega(){
        setSize(900,600);
        setContentPane (PainelSorteio);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        verButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ResultMega.setText(Arrays.toString(geradorMegasena()));
            }
        });

        voltarButton.addActionListener(new ActionListener() {

        @Override

        public void actionPerformed(ActionEvent e) {
              new telaPrincipal();
              dispose();

              }
        });

        }
    }

