/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradespesas;

/**
 *
 * @author ogird
 */
import java.util.Scanner;

public class CalculadoraDespesas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGasto = 0;

        System.out.println("Bem-vindo à Calculadora de Despesas!");

        while (true) {
            System.out.print("Digite o valor da despesa (ou 0 para sair): ");
            double despesa = scanner.nextDouble();

            if (despesa == 0) {
                break; // Sai do loop se o usuário digitar 0
            }

            totalGasto += despesa;
            System.out.printf("Despesa registrada: %.2f\n", despesa);
        }

        System.out.printf("Total gasto: %.2f\n", totalGasto);
        System.out.println("Obrigado por usar a Calculadora de Despesas!");
    }
}