/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uc06at03;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author Vinicius Camilotti
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Modelo tipo = null;
       String tipoNome;
       
        
       Scanner input = new Scanner(System.in);
       System.out.println("Qual tipo de exercicio desja fazer?\n");
       System.out.println("1) Resistencia  2) Velocidade\n");
       
       int tipoExercicio = input.nextInt();
       
       switch(tipoExercicio){
           case 1:
               tipo = new ResistenciaFactory();
               tipoNome = "Resistência";
           break;
           case 2:
               tipo = new VelocidadeFactory();
               tipoNome = "Velocidade";
           break;
           default:
               System.out.println("Invalido, tente novamente");
               return;
       };
       

       
       List<Musculacao> musculacao = tipo.getMusculacao();
       List<Corrida> corrida = tipo.getCorrida();
       
       System.out.println("Exercicios "+ tipoNome +"/Musculação:"); 
       for (int i = 0; i <musculacao.size(); i++){
           String ex = musculacao.get(i).nome();
           
           String item = String.format("%s) %s", i+1, ex);
           System.out.println(item);
           
       };
       System.out.println("\n");
       
       System.out.println("Exercicios " + tipoNome + "/Corrida:"); 
       for (int e = 0; e <corrida.size(); e++){
           String ex = corrida.get(e).nome();
           
           String item = String.format("%s) %s", e+1, ex);
           System.out.println(item);
           
       };
       
    }
   
}
