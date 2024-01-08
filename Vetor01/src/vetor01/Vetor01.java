/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author ogird
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4}; //Vetor n recebe { 3,2 ...
                                //Toda vez que se usa [] se cria um objeto (com caracteristicas e métodos)
        //System.out.println("Total de casas de N " + n.length);
        for(int c=0; c<=n.length-1; c++){
            System.out.println("Na posicao " + c + " temos o valor " + n[c]); //Lembrando que o + não é adição e sim concatenação
        }
    }
}
