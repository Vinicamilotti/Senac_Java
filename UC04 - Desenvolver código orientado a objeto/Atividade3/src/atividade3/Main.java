/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade3;
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
        Funcionario[] funcionarios = new Funcionario[10];
        int cFuncionario = 0;
        for (int i = 0; i < 10; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Novo funcionÃ¡rio\n Digite o nome:");
            String nome = input.nextLine();
            if(nome.equals("PARE")) break;
            input = new Scanner(System.in);
            System.out.println("Digite o setor");
            String setor = input.nextLine();
            input = new Scanner(System.in);
            System.out.println("Digite o CPF");
            String cpf = input.nextLine();
            input = new Scanner(System.in);
            System.out.println("Digite o Telefone");
            String telefone = input.nextLine();
            input = new Scanner(System.in);
            System.out.println("Digite o EndereÃ§o");
            String endereco = input.nextLine();
            System.out.println("FuncionÃ¡rio tipo \n 1) Assalariado 2) Horista");
            int tipo = input.nextInt();
            switch (tipo){
                case 1:
                    input = new Scanner(System.in);
                    System.out.println("Digite o salÃ¡rio");
                    float salario = input.nextFloat();
                    Funcionario novoFuncionario = new Assalariado();
                    novoFuncionario.valor = salario;
                    novoFuncionario.setor = setor;
                    novoFuncionario.nome = nome;
                    novoFuncionario.endereco = endereco;
                    novoFuncionario.cpf = cpf;
                    novoFuncionario.telefone = telefone;
                    novoFuncionario.tipo = "Assalariado";
                    funcionarios[cFuncionario] = novoFuncionario;
                    cFuncionario += 1;
                    break;
                case 2:
                    input = new Scanner(System.in);
                    System.out.println("Digite o valor/Hora");
                    float vlHora = input.nextFloat();
                    Funcionario novoFuncionarioH = new Horista();
                    novoFuncionarioH.valor = vlHora;
                    novoFuncionarioH.setor = setor;
                    novoFuncionarioH.nome = nome;
                    novoFuncionarioH.endereco = endereco;
                    novoFuncionarioH.cpf = cpf;
                    novoFuncionarioH.telefone = telefone;
                    novoFuncionarioH.tipo = "Horista";
                    input = new Scanner(System.in);
                    System.out.println("Digite o total de horas trabalhadas");
                    int tHora = input.nextInt();
                    novoFuncionarioH.horasTrabalhadas = tHora;

                    funcionarios[cFuncionario] = novoFuncionarioH;
                    cFuncionario += 1;
                    break;

            }

        }

        for (int f =0; f<cFuncionario; f++){
            System.out.println(funcionarios[f].nome + " - " + funcionarios[f].tipo + " - R$ " + funcionarios[f].getSalario());
        }

        System.out.println("Aplicar aumento geral de: (digitar x por cento Ex. 25 = 25%)");
        Scanner input = new Scanner(System.in);
        int aumento = input.nextInt();
        for (int f = 0; f < cFuncionario; f++){
            funcionarios[f].aumento((float)aumento/100);
        }
        System.out.println("Novos pagamentos com " + aumento + "% de aumento");
        for (int f =0; f<cFuncionario; f++){
            System.out.println(funcionarios[f].nome + " - " + funcionarios[f].tipo + " - R$ " + funcionarios[f].getSalario());
        }
    }
    
}
