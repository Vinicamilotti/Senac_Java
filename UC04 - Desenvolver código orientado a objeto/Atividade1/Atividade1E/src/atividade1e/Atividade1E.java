/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1e;
import java.util.Scanner;
/**
 *
 * @author Vinicius Camilotti
 */
public class Atividade1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        class Ocupacao {
            int[][] quarto = new int[4][3];

            public void preencher(){
                for(int i=0; i< quarto.length; i++){
                    for (int j = 0; j< quarto[i].length; j++){
                        quarto[i][j] = 0;
                    }
                }
            };
            public void descrever(){
                for(int i=0;i< quarto.length; i++){
                    int andar = i + 1;
                    System.out.println("Andar " + andar + ":");
                    for (int j = 0; j< quarto[i].length; j++){
                        int quartoAndar = j + 1;
                        if(quarto[i][j] == 0){
                            System.out.println("Quarto " + quartoAndar + " Andar " + andar + " - Quarto livre" );
                        }else{
                            System.out.println("Quarto " + quartoAndar + " Andar " + andar + " - Quarto ocupado" );
                        }
                    }
                }
            };
            public void informarOcupacao(){
                Scanner input = new Scanner(System.in);
                System.out.println("Informe andar: ");
                int andar = input.nextInt();
                if(andar> quarto.length || andar < 0){
                    System.out.println("Andar invalido, tente novamente:");
                    informarOcupacao();
                }
                System.out.println("Informe o quarto que serÃ¡ ocupado: ");
                int nquarto = input.nextInt();
                if(nquarto > quarto[0].length || nquarto < 0){
                    System.out.println("Quarto invalido, tente novamente:");
                    informarOcupacao();
                }
                int estado = quarto[andar - 1][nquarto - 1];
                if (estado == 0){
                    quarto[andar - 1][nquarto - 1] = 1;
                }
                else{
                    System.out.println("Quarto jÃ¡ ocupado tente novamente");
                    informarOcupacao();
                }

                System.out.println("Deseja informar outra ocupaÃ§Ã£o? (S/N)");
                input = new Scanner(System.in);
                String dialog = input.nextLine();
                if(dialog.equals("S")){
                    informarOcupacao();
                }
                else{
                    this.descrever();
                }
            }
        }
        Ocupacao programa = new Ocupacao();
        programa.preencher();
        programa.informarOcupacao();
    }
    
}
