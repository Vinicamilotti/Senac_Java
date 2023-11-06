/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade4;
import java.util.Scanner;
/**
 *
 * @author Vinicius Camilotti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome da empresa:");
        String empresa = input.nextLine();
        Pagamentos pagamentos = new Pagamentos(empresa);
        int state = 0;
        while(state != 3){
            System.out.println("Cadastrar imposto");
            System.out.println("1) IPI  2) PIS 3) Sair");
            state = input.nextInt();
            input.nextLine();
            switch (state){
                case 1:
                    String nomeIpi;
                    double valor;
                    double seguro;
                    double frete;
                    double outrasDespesas;
                    double aliquota;
                    System.out.println("Descreva o IPI");
                    nomeIpi = input.nextLine();
                    System.out.println("Digite o valor do produto");
                    valor = input.nextDouble();
                    input.nextLine();
                    System.out.println("Digite o valor do seguro");
                    seguro = input.nextDouble();
                    input.nextLine();
                    System.out.println("Digite o valor do frete");
                    frete = input.nextDouble();
                    input.nextLine();
                    System.out.println("Digite o valor de outras despesas com o produto");
                    outrasDespesas = input.nextDouble();
                    input.nextLine();
                    System.out.println("Digite a aliquota (Digite a porcentagem ex: 20 = 20%)");
                    aliquota = input.nextDouble();
                    input.nextLine();
                    Imposto ipi = new IPI(nomeIpi,valor, seguro, frete, outrasDespesas, aliquota);
                    pagamentos.addPagamento(ipi);
                    break;
                case 2:
                    String nomePIS;
                    double credito;
                    double debito;
                    System.out.println("Digite o nome do PIS");
                    nomePIS = input.nextLine();
                    System.out.println("Digite o crÃ©dito:");
                    credito = input.nextDouble();
                    input.nextLine();
                    System.out.println("Digite o debito");
                    debito = input.nextDouble();
                    input.nextLine();
                    Imposto pis = new PIS(nomePIS, credito, debito);
                    pagamentos.addPagamento(pis);
            }
        }
        pagamentos.printValoresIndividuais();
        pagamentos.printTotalTipo("PIS");
        pagamentos.printTotalTipo("IPI");
        pagamentos.printTotal();
    }
    
}
