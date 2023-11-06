/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

/**
 *
 * @author Vinicius Camilotti
 */
public abstract class Funcionario {
   String tipo;
   String nome;
   String endereco;
   String cpf;
   String telefone;
   String setor;
   float valor;
   int horasTrabalhadas;
   public abstract float getSalario();
    public void aumento(float porcentagem){
        this.valor = this.valor + (this.valor*porcentagem);
    } 
}
