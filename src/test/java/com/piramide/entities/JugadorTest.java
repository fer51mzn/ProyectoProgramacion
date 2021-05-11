package com.piramide.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JugadorTest {

    @Test
    public void asignaDatos(){
        Jugador jugador = new Jugador();
        String codigoEsperado = "13";
        jugador.setCodigo(codigoEsperado);
        String nombreEsperado = "Jesus";
        jugador.setNombre(nombreEsperado);
        String paisEsperado = "Argentina";
        jugador.setPais(paisEsperado);
        String fechanacimientoEsperada = "1998-01-01";
        jugador.setFechanacimiento(fechanacimientoEsperada);
        String activoEsperado = "Si";
        jugador.setActivo(activoEsperado);
        Integer posicionrankingEsperada = 13;
        jugador.setPosicionranking(posicionrankingEsperada);
        Integer puntosEsperados = 2400;
        jugador.setPuntos(puntosEsperados);
        assertEquals(codigoEsperado,jugador.getCodigo());
        assertEquals(nombreEsperado,jugador.getNombre());
        assertEquals(paisEsperado,jugador.getPais());
        assertEquals(fechanacimientoEsperada,jugador.getFechanacimiento());
        assertEquals(activoEsperado,jugador.getActivo());
        assertEquals(posicionrankingEsperada,jugador.getPosicionranking());
        assertEquals(puntosEsperados,jugador.getPuntos());
    }
}
