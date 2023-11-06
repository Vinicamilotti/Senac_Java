/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadec;
import java.util.Scanner;
/**
 *
 * @author Vinicius Camilotti
 */
public class AtividadeC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        class Hospede {
            String nome;
            int idade;

            public Hospede(String nomeHospede, int idadeHospede) {
                nome = nomeHospede;
                idade = idadeHospede;

            }
        }
        class Hotel {
            float diaria;
            int hospedagens;
            int meias;
            int gratuidades;

            float valorTotal;

            public void cadastrarHospede(Hospede novoHospede) {
                if (novoHospede.idade >= 80) {
                    this.hospedagens += 1;
                    this.meias += 1;
                    this.valorTotal += (float) this.diaria / 2;
                    System.out.println(novoHospede.idade + " Paga meia");
                } else if (novoHospede.idade <= 4) {
                    this.hospedagens += 1;
                    this.gratuidades += 1;
                    System.out.println(novoHospede.idade + " possui gratuidade");
                } else {
                    this.hospedagens += 1;
                    this.valorTotal += (float) this.diaria;
                }

            }
           public void descrever(){
                String descricao = "Total de hospedes: " + hospedagens + "; Receita: " + valorTotal + "; " + meias + " meias; " + gratuidades + " gratuidades";
                System.out.println(descricao);
           }

        }

        System.out.println("Digite o valor da diaria: ");
        float valorDiaria = input.nextFloat();

        Hotel hotel = new Hotel();
        hotel.diaria = valorDiaria;

        int parada = 0;
        while (parada == 0) {
            input = new Scanner(System.in);
            System.out.println("Digite o nome do hospede");
            String nome = input.nextLine();
            if(nome.equals("PARE")){
                parada = 1;
                continue;
            };
            System.out.println("Digite a idade do hospede");
            int idade = input.nextInt();
            Hospede novoHospede = new Hospede(nome, idade);
            hotel.cadastrarHospede(novoHospede);
        } ;

        hotel.descrever();
    }
    
}
