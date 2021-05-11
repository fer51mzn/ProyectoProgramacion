package com.piramide.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartidoTest {

    @Test
    public void asignaDatos(){
        Partido partido = new Partido();
        String codigoEsperado = "1";
        partido.setCodigo(codigoEsperado);
        Integer primerset = 1 ;
        partido.setPrimerset(primerset);
        Integer segundoset = 1;
        partido.setSegundoset(segundoset);
        Integer tercerset = 1;
        partido.setTercerset(tercerset);
        String enfrentamiento = "Novak vs Rafael";
        partido.setEnfrentamiento(enfrentamiento);
        Integer campeonato = 0;
        partido.setCampeonato(campeonato);
        String ganador = "Novak";
        partido.setGanador(ganador);
        assertEquals(codigoEsperado,partido.getCodigo());
        assertEquals(primerset,partido.getPrimerset());
        assertEquals(segundoset,partido.getSegundoset());
        assertEquals(tercerset,partido.getTercerset());
        assertEquals(enfrentamiento,partido.getEnfrentamiento());
        assertEquals(campeonato,partido.getCampeonato());
        assertEquals(ganador,partido.getGanador());
    }
}
