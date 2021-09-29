package semana4.clase1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener {
    
    private JLabel description, result;
    private JTextField inputDolars;
    private JButton calculate;
    
    MainWindow() {
        // setBounds(10, 10, 300, 300); // tamañp y posicion
        // setSize(300, 300);
        // setLocationRelativeTo(null); //centramos la ventana

        Toolkit myScreen = Toolkit.getDefaultToolkit(); //detecto la pantalla
        Dimension screenSize = myScreen.getScreenSize(); // obtengo el tamaño de la pantalla
        int height = screenSize.height;
        int width = screenSize.width;
        setSize(width/2, height/2);
        setLocationRelativeTo(null); //centramos la ventana

        setTitle("Mision TIC"); // titulo de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); // contenedor
        panel.setLayout(null); // permite ubicar los elementos como se desee
        this.getContentPane().add(panel); // el panel se encarga de ubicar los elementos
        
        this.description = new JLabel("Convertir de dolares a persos");
        this.description.setBounds(10,10,250,50); // (x, y, width, height)        
        panel.add(this.description); //agrega elemento a la ventana

        this.inputDolars = new JTextField();
        this.inputDolars.setBounds(10, 60, 100, 30);
        panel.add(this.inputDolars);    
        
        this.result = new JLabel("0.0");
        this.result.setBounds(30, 100, 100, 30);
        panel.add(this.result);

        this.calculate = new JButton("Calcular");
        this.calculate.setBounds(10, 140, 100, 30);
        this.calculate.addActionListener(this);
        panel.add(this.calculate);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dolars = inputDolars.getText();
        double pesos = Double.parseDouble(dolars)*3900;
        result.setText(""+pesos);
        // JOptionPane.showMessageDialog(this, "" + pesos);
    }
}
