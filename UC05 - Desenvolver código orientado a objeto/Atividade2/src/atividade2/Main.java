/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;
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
        System.out.println("Crie o pacote de viagens:");
        System.out.println("Informe sobre o transporte");
        System.out.println("Qual o tipo de transporte?");
        String tipoTransporte = input.nextLine();
        System.out.println("Qual o valor do transporte?");
        double valorTransporte = input.nextDouble();
        Transporte trasp = new Transporte(tipoTransporte, valorTransporte);
        System.out.println("===============================");

        input = new Scanner(System.in);
        System.out.println("Agora Informe sobre a hospedagem: \n DescriÃ§Ã£o da hospedagem");
        String descHospedagem = input.nextLine();
        System.out.println("Valor da diÃ¡ria");
        double valorHospedagem = input.nextDouble();
        Hospedagem hosp = new Hospedagem(descHospedagem, valorHospedagem);
        System.out.println("================================");

        input = new Scanner(System.in);
        System.out.println("Informe a quantidade de diÃ¡rias");
        int diarias = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Informe o destino");
        String destino = input.nextLine();
        PacoteDeViagem pacote = new PacoteDeViagem(hosp, trasp, diarias, destino);
        System.out.println("=================================");

        System.out.println("Dados gerais:");
        System.out.println("Pacote " + pacote.destino + ": ");
        System.out.println("Tipo de transporte: " + pacote.transporte.Tipo);
        System.out.println("Valor do transporte(US): " + pacote.transporte.Valor);
        System.out.println("Hospedagem: " + pacote.hospedagem.Descricao);
        System.out.println("Valor da diÃ¡ria(US): " + pacote.hospedagem.ValorDiaria);
        System.out.println("Total Hospedagem(US): " + pacote.getValorHospedagem());
        System.out.println("Custo em dolares(US): " + pacote.getPacoteValor());
        System.out.println("=================================");

        input = new Scanner(System.in);
        System.out.println("Iniciando a venda \n Informe uma margem de lucro \n (inteiro serÃ¡ convertido na porcentagem equivalente ex 25 = 25/100):");
        int porcentagem = input.nextInt();
        float margem = (float) porcentagem/100;
        System.out.println("Informe a cotaÃ§Ã£o do dolar");
        float cotacao = input.nextFloat();
        Venda venda = new Venda(pacote,margem, cotacao);
        System.out.println("=================================");
        System.out.println("OrÃ§amento final:");
        System.out.println("Pacote " + venda.pacoteDeViagem.destino + ": ");
        System.out.println("Tipo de transporte: " + venda.pacoteDeViagem.transporte.Tipo);
        System.out.println("Hospedagem: " + venda.pacoteDeViagem.hospedagem.Descricao);
        System.out.println("Valor total em dolares: U$D " + venda.getPrecoVenda());
        System.out.println("Valor total em reais: R$ " + venda.getPrecoVendaReais());
    }
    
}
