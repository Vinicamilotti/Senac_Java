/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4;
import java.util.ArrayList;
/**
 *
 * @author Vinicius Camilotti
 */

public class Pagamentos {
    ArrayList<Imposto> pagamentos = new ArrayList<Imposto>();
    String empresa;
    public Pagamentos(String _empresa) {
        this.empresa = _empresa;
    }

    public void addPagamento(Imposto _imposto){
        this.pagamentos.add(_imposto);
    }
    public void printValoresIndividuais(){
        for (int i = 0; i<pagamentos.size(); i++){
            System.out.println("Tipo de imposto: " + this.pagamentos.get(i).getTipoImposto());
            System.out.println("Imposto: " + this.pagamentos.get(i).getDescricao());
            System.out.println("Valor: R$" + this.pagamentos.get(i).Calculo());
        }
    }

    public void printTotalTipo(String _tipo){
        double totalTipo = 0;
        for(int i = 0; i<pagamentos.size(); i++){
            if(pagamentos.get(i).getTipoImposto().equals(_tipo)){
                totalTipo += pagamentos.get(i).Calculo();
            }
        }
        System.out.println("Total em " + _tipo + ": R$ " + totalTipo);
    };
    public void printTotal(){
        double total = 0;
        for(int i = 0; i<pagamentos.size(); i++){
            total += pagamentos.get(i).Calculo();
        }
        System.out.println("Total em impostos: R$" + total);
    }
}
