/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author Vinicius Camilotti
 */
public class PacoteDeViagem {
    String destino;
    Hospedagem hospedagem;
    Transporte transporte;
    int dias;

    public PacoteDeViagem (Hospedagem hotel, Transporte translado, int totalDias, String pacoteDestino){
        destino = pacoteDestino;
        dias = totalDias;
        hospedagem = hotel;
        transporte = translado;
    }


    public double getValorHospedagem(){
        return hospedagem.ValorDiaria * this.dias;
    }
    public double getPacoteValor(){
        return transporte.Valor + this.getValorHospedagem();
    }

    public double getPrecoPacote(float margemLucro){
        return this.getPacoteValor() + (this.getPacoteValor() * margemLucro);
    }
    public double getLucro(float margemLucro){
        return getPrecoPacote(margemLucro) - getPacoteValor();
    }

}
