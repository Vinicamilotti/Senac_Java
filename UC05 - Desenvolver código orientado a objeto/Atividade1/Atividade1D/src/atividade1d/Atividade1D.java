/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1d;
import java.util.Scanner;

/**
 *
 * @author Vinicius Camilotti
 */
public class Atividade1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String[] hotel = new String[15];

        class Menu{
            int lastIndex = 0;
            public void menu(){
                Scanner menuScanner = new Scanner(System.in);
                System.out.println("Bem Vindo!");
                System.out.println("MENU:");
                System.out.println("1) Cadastro 2) Pesquisa 3) Sair");
                int menuInput = menuScanner.nextInt();
                switch (menuInput){
                    case 1:
                        this.cadastro();
                        break;
                    case 2:
                        this.pesquisa();
                    case 3:
                        return;
                }
      }
            public void cadastro(){
                Scanner input = new Scanner(System.in);
                if(lastIndex < 15){
                    System.out.println("Digite o nome do hospede");
                    String nome = input.nextLine();
                    hotel[lastIndex] = nome;
                    lastIndex += 1;
                    System.out.println("Deseja cadastrar mais hospedes (S/N)?");
                    String dialog = input.nextLine();
                    if(dialog.equals("S")){
                        this.cadastro();
                    }else{
                        this.menu();
                    }
                }else{
                    System.out.println("Numero mÃ¡ximo de hospedes atingido");
                    this.menu();
                }

            }
            public void pesquisa(){
                System.out.println("Digite o nome do hospede");
                Scanner input = new Scanner(System.in);
                String nome = input.nextLine();
                String Response = "NÃ£o encontrado";
                for(int i=0; i < lastIndex; i++){
                    if(nome.equals(hotel[i])){
                        Response = hotel[i] + " econtrado no indice " + i;
                        break;
                    }
                }
                System.out.println(Response);
                this.menu();
            }

        }

        Menu menu = new Menu();
        menu.menu();
    }
    
}
