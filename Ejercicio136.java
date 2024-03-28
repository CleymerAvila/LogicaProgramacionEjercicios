import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ejercicio136 {
    private static JLabel hora;
    public static void main(String[] args) {

        JFrame ventanaRelog = new JFrame("RELOG");
        ventanaRelog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaRelog.setBounds(100,100,300,200);
        ventanaRelog.setResizable(false);

        JPanel panelPrincipal = new JPanel();
        ventanaRelog.add(panelPrincipal);
        hora = new JLabel();
        hora.setFont(new Font("Calibri", Font.BOLD, 60));
        panelPrincipal.add(hora);
        
        ventanaRelog.setVisible(true);

        DameLaHora oyente = new DameLaHora();
        Timer miTemporizador = new Timer(1000, oyente);
        miTemporizador.start();
    }

    private static class DameLaHora implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date fecha = new Date();
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");    
            hora.setText(String.valueOf(formatoHora.format(fecha)));
        }
    }
 
}


