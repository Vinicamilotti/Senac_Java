/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4;

/**
 *
 * @author Vinicius Camilotti
 */
public abstract class Imposto {
    protected String tipoImposto;
    protected String descricao;
    public abstract double Calculo();

    public Imposto(String _descricao){
        this.descricao = _descricao;
    };

    public String getDescricao() {
        return descricao;
    }
    public String getTipoImposto(){
        return tipoImposto;
    }
}
