/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4;

/**
 *
 * @author Vinicius Camilotti
 */
public class IPI extends Imposto{
    double valor;
    double seguro;
    double frete;
    double outrasDespesas;

    double aliquota;
    public IPI(String _descricao, double _valor, double _seguro, double _frete, double _outrasDespesas, double _aliquota){
        super(_descricao);
        this.valor = _valor;
        this.seguro = _seguro;
        this.frete = _frete;
        this.outrasDespesas = _outrasDespesas;
        this.aliquota = _aliquota/100;
        this.tipoImposto = "IPI";
    }
    @Override
    public double Calculo(){
        double sum = valor + seguro + frete + outrasDespesas;
        return sum*aliquota;
    }

}
