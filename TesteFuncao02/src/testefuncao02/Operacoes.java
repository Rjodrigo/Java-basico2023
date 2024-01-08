/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author ogird
 */
public class Operacoes {
    //psvm = sout (sout System.out.Println) psvm (Public Static Void main)
         public static String contador (int i, int f) {
            String s = "";
            for (int c = i; c <= f ; c++) { 
                s += c + " ";
            }
            return s;
        }    
}
