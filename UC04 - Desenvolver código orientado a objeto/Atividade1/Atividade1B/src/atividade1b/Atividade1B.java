/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1b;
import java.util.Scanner;
/**
 *
 * @author Vinicius Camilotti
 */
public class Atividade1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        class Cliente {
            String nome;
            int idade;

            public boolean getDesconto(){
                return this.idade >= 60;
            }
        }
        class Quarto{
            Cliente hospede;
            String quarto;

            public void descrever(){
                String Response;
                if(this.hospede.getDesconto()) {
                    Response = String.format("Quarto %s : %s com 40/100 de desconto", this.quarto, this.hospede.nome);
                }else{
                    Response = String.format("Quarto %s : %s", this.quarto, this.hospede.nome);
                }
                System.out.println(Response);
            }
        }
        Quarto quartoA = new Quarto();
        quartoA.quarto = "A";

        Quarto quartoB = new Quarto();
        quartoB.quarto = "B";

        System.out.println("Digite o nome do cliente A:");
        String nome = input.nextLine();
        System.out.println("Digite a idade do cliente A:");
        int idade = input.nextInt();

        Cliente clienteA = new Cliente();
        clienteA.nome = nome;
        clienteA.idade = idade;

        quartoA.hospede = clienteA;

        input = new Scanner(System.in);

        System.out.println("Digite o nome do cliente B:");
        nome = input.nextLine();
        System.out.println("Digite a idade do cliente B:");
        idade = input.nextInt();

        Cliente clienteB = new Cliente();
        clienteB.nome = nome;
        clienteB.idade = idade;

        if(clienteB.idade > clienteA.idade){
            quartoA.hospede = clienteB;
            quartoB.hospede = clienteA;
        }else{
            quartoB.hospede = clienteB;
        }

        quartoA.descrever();
        quartoB.descrever();
        // TODO code application logic here
    }
    
}
