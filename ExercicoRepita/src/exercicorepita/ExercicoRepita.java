/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author ogird
 */
public class ExercicoRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<html>Informe um numero: <br>O valor 0 interrompe<br><html>"));
        s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null,"<html>Resultado final <br>-------<br>" + 
                "Somatório vale <html>" + s);
    }
    
}
