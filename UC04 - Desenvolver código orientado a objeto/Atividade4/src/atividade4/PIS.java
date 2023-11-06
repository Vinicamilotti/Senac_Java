/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4;

/**
 *
 * @author Vinicius Camilotti
 */
public class PIS extends Imposto{
    double credito;
    double debito;
    double constante = 1.65/100;
    public PIS(String _descricao, double _credito, double _debito){
        super(_descricao);
        this.credito = _credito;
        this.debito = _debito;
        this.tipoImposto = "PIS";
    }
    @Override
    public double Calculo() {
        double receita = debito - credito;
        return receita*constante;
    }
}
