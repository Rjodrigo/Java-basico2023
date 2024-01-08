/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author ogird
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int CC = 0;
        while (CC<10) {
            CC++;
            if (CC == 2 || CC == 3 || CC == 4) {
                continue;
            }
            if (CC == 7) {
                break;
            }
            System.out.println("Cambalhota" + CC);
            
        }
        
    }
    
}
