package com.piramide.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeonatoTest {

    @Test
    public void asignaDatos(){
        Campeonato campeonato = new Campeonato();
        String codigoEsperado = "13";
        campeonato.setCodigo(codigoEsperado);
        String fechaEsperada = "2021/06/20";
        campeonato.setFecha(fechaEsperada);
        String lugarEsperado = "Dubai";
        campeonato.setLugar(lugarEsperado);
        String nombreEsperado = "Juan";
        campeonato.setNombre(nombreEsperado);
        assertEquals(fechaEsperada,campeonato.getFecha());
        assertEquals(lugarEsperado,campeonato.getLugar());
        assertEquals(codigoEsperado,campeonato.getCodigo());
        assertEquals(nombreEsperado,campeonato.getNombre());
    }
}