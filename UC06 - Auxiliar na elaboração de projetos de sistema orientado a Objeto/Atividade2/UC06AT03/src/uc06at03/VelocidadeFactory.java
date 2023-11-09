/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06at03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius Camilotti
 */
public class VelocidadeFactory implements Modelo {
       
    @Override
    public List<Corrida> getCorrida(){
        List<Corrida> corridaResistencia = new ArrayList<>();
        corridaResistencia.add(new CemMetrosRasos());
        corridaResistencia.add(new DuzentosMetrosRazos());
        
        return corridaResistencia;
    };
    
    @Override
    public List<Musculacao> getMusculacao(){
        List<Musculacao> musculacaoResistencia = new ArrayList<>();
        musculacaoResistencia.add(new EmpurrarPneu());
        musculacaoResistencia.add(new Flexao());
        
        return musculacaoResistencia;
    }
}