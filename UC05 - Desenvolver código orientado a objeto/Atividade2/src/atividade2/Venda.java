/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author Vinicius Camilotti
 */
public class Venda {
    PacoteDeViagem pacoteDeViagem;
    float margemLucro;
    float cotacaoDolar;
    public Venda(PacoteDeViagem pacote, float lucro, float dolar){
        margemLucro = lucro;
        cotacaoDolar = dolar;
        pacoteDeViagem = pacote;
    }

    public double getPrecoVendaReais(){
        return this.pacoteDeViagem.getPrecoPacote(margemLucro)*cotacaoDolar;
    };
    public double getPrecoVenda(){
        return this.pacoteDeViagem.getPrecoPacote(margemLucro);
    }
}

