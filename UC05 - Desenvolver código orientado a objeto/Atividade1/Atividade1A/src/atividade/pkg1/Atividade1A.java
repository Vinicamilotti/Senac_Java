/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg1;
import java.util.Scanner;
/**
 *
 * @author Vinicius Camilotti
 */
public class Atividade1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int auditorioAlpha = 150;
        int auditorioAlphaExtra = 70;
        int maxAuditorioAlpha = auditorioAlpha + auditorioAlphaExtra;
        int maxAuditorioBeta = 350;

        System.out.println("Digite o numero de convidados: ");

        int convidados = input.nextInt();
        boolean valido = convidados > 0 && convidados <= maxAuditorioBeta;
        if(!valido){
            System.out.println("Numero de convidados invalido");
            return;
        }
        if(convidados <= maxAuditorioAlpha) {
            if (convidados <= auditorioAlpha) {
                System.out.println("Utilize o auditÃ³rio Alpha");
            }
            if (convidados > auditorioAlpha && convidados <= maxAuditorioAlpha) {
                int Adicional = convidados - auditorioAlpha;
                System.out.println("Utilize o auditorio Alpha");
                System.out.println(String.format("Adicione %d cadeiras", Adicional));
            }
        }
        else {
            System.out.println("Utilize o auditorio Beta");
        }
    }
    
}
