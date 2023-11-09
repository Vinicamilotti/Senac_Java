/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc06at03;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Vinicius Camilotti
 */
public class ResistenciaFactory implements Modelo {
    @Override
    public List<Corrida> getCorrida(){
        List<Corrida> corridaResistencia = new ArrayList<>();
        corridaResistencia.add(new MeiaMaratona());
        corridaResistencia.add(new Maratona());
        
        return corridaResistencia;
    };
    
    @Override
    public List<Musculacao> getMusculacao(){
        List<Musculacao> musculacaoResistencia = new ArrayList<>();
        musculacaoResistencia.add(new Prancha());
        musculacaoResistencia.add(new LevantamentoDePeso());
        
        return musculacaoResistencia;
    }
}
